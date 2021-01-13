package Study.DesignPattern.prototype;

public class Sheep implements Cloneable{
	
	private String name;
	
	private String color;
	
	private Friend friend;
	
	

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Sheep(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", color=" + color + ", friend=" + friend + "]";
	}

	
	
	

}
