package Study.DesignPattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

public class Client {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		ITeacher proxy = (ITeacher) Proxy.newProxyInstance(teacher.getClass().getClassLoader(),
				teacher.getClass().getInterfaces(), new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("开始");
						Object invoke = method.invoke(teacher, args);
						System.out.println("结束");
						return invoke;
					}
				});
		proxy.teach();
	}

}
