package Study.DesignPattern.factory.factorymethod.product;

public abstract class Pizza {
	
	private String name;
	
	public Pizza(String name) {
		super();
		this.name = name;
	}

	public abstract void add();
	
	public void bak() {
		System.out.println("制作pizza");
	}
	
	public void done() {
		System.out.println("制作完成");
	}
}
