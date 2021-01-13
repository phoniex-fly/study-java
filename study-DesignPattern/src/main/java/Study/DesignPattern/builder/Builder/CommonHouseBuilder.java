package Study.DesignPattern.builder.Builder;

import Study.DesignPattern.builder.Product.House;

public class CommonHouseBuilder extends HouseBuilder{

	@Override
	protected void buildBasis(House house) {
		house.setBasis("100cm");
	}

	@Override
	protected void buildWall(House house) {
		house.setWall("100m");
	}

	@Override
	protected void buildRoof(House house) {
		house.setRoof("灰");
	}

	@Override
	public House bulidHouse() {
		House house = new House();
		buildBasis(house);
		buildWall(house);
		buildRoof(house);
		return house;
	}

}
