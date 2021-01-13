package Study.DesignPattern.builder.Builder;

import Study.DesignPattern.builder.Product.House;

public abstract class HouseBuilder {
	

	/**
	 * 建造地基
	 */
	protected abstract void buildBasis(House house);
	/**
	 * 建造墙壁
	 */
	protected abstract void buildWall(House house);
	/**
	 * 建造屋顶
	 */
	protected abstract void buildRoof(House house);
	
	/**
	 * 建造房子
	 * @return
	 */
	public abstract House bulidHouse();
	
	

}
