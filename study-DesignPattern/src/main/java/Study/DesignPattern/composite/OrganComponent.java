package Study.DesignPattern.composite;

import java.util.List;

public abstract class OrganComponent {
	
	private String name;

	public OrganComponent(String name) {
		this.name = name;
	}
	
	/**
	 * 增加子节点
	 * 
	 * @param organ
	 */
	abstract void addChild(OrganComponent organ);
	
	/**
	 * 删除子节点
	 * 
	 * @param organ
	 */
	abstract public void removeChild(OrganComponent organ);
	
	/**
	 * 获取子节点
	 * 
	 * @param organ
	 */
	abstract public void listChild();
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	


	
}
