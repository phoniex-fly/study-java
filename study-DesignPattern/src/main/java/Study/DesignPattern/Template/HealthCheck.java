package Study.DesignPattern.Template;

public abstract class HealthCheck {
	
	/**
	 * 体检
	 */
	public final void HealthCheck() {
		heignt();
		weight();
		blood();
		virus();
		
	}
	
	public void heignt() {
		System.out.println("测量身高");
	}
	
	public void weight() {
		System.out.println("测量体重");
	}
	
	public void blood() {
		System.out.println("抽血");
	}
	
	public abstract void virus();

}
