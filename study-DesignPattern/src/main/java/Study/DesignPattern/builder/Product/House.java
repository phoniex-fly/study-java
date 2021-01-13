package Study.DesignPattern.builder.Product;

public class House {
	private String wall;
	private String roof;
	private String basis;
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public String getBasis() {
		return basis;
	}
	public void setBasis(String basis) {
		this.basis = basis;
	}
	@Override
	public String toString() {
		return "House [wall=" + wall + ", roof=" + roof + ", basis=" + basis + "]";
	}
	

}
