package Study.DesignPattern.builder.Builder;

import Study.DesignPattern.builder.Product.House;

public class VillaBuilder extends HouseBuilder{

	@Override
	protected void buildBasis(House house) {
		house.setBasis("10cm");
	}

	@Override
	protected void buildWall(House house) {
		house.setWall("10m");
	}

	@Override
	protected void buildRoof(House house) {
		house.setRoof("红");
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
