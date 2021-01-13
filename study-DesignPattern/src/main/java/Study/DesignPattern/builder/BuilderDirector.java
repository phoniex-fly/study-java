package Study.DesignPattern.builder;

import Study.DesignPattern.builder.Builder.HouseBuilder;
import Study.DesignPattern.builder.Product.House;

public class BuilderDirector {
	
	private HouseBuilder builder;

	public BuilderDirector(HouseBuilder builder) {
		this.builder = builder;
	}

	public void setBuilder(HouseBuilder builder) {
		this.builder = builder;
	}
	

	public House getHouse(){
		return builder.bulidHouse();
	}
}
