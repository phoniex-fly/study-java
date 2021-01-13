package Study.DesignPattern.builder;

import Study.DesignPattern.builder.Builder.CommonHouseBuilder;
import Study.DesignPattern.builder.Builder.HouseBuilder;
import Study.DesignPattern.builder.Builder.VillaBuilder;

public class Client {
	public static void main(String[] args) {
		HouseBuilder builder = new CommonHouseBuilder();
		BuilderDirector director = new BuilderDirector(builder);
		System.out.println(director.getHouse());
		
		builder = new VillaBuilder();
		director.setBuilder(builder);
		System.out.println(director.getHouse());
		
		
		
	}

}
