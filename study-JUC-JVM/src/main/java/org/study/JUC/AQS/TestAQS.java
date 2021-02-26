package org.study.JUC.AQS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class Mylock implements Lock{
	
	class Mysync extends AbstractQueuedSynchronizer{

		@Override
		protected boolean tryAcquire(int arg) {
			if(compareAndSetState(0, 1)) {
//				setExclusiveOwnerThread(Thread.currentThread());
				return true;
			}
			return false;
		}

		@Override
		protected boolean tryRelease(int arg) {
//			setExclusiveOwnerThread(null);
			setState(0);//volitile
			return true;
		}

		@Override
		protected boolean isHeldExclusively() {
			return getState() == 1;
		}
		
		public Condition newCondition() {
			return new ConditionObject();
		}
	}
	
	private Mysync sync = new Mysync();

	public void lock() {
		sync.acquire(1);
	}

	public void lockInterruptibly() throws InterruptedException {
		sync.acquireInterruptibly(1);
	}

	public boolean tryLock() {
		return sync.tryAcquire(1);
	}

	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		return sync.tryAcquireNanos(1, unit.toNanos(time));
	}

	public void unlock() {
		sync.release(1);
	}

	public Condition newCondition() {
		return sync.newCondition();
	}
	
}
public class TestAQS{

}
