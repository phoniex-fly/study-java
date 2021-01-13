package Study.DesignPattern.composite;

public class Klass extends OrganComponent{

	public Klass(String name) {
		super(name);
	}

	@Override
	void addChild(OrganComponent organ) {
		
	}

	@Override
	public void removeChild(OrganComponent organ) {
		
	}

	@Override
	public void listChild() {
		System.out.println("------------"+getName());
	}

	
}
