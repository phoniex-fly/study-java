package Study.DesignPattern.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep sheep = new Sheep("tom", "red");
		System.out.println(sheep);
		Sheep sheep1 = (Sheep) sheep.clone();
		System.out.println(sheep1);
		
		sheep.setColor("brown");
		System.out.println("原型类基本属性变化："+sheep);
		System.out.println("克隆类基本属性不会随着变化："+sheep1);
		
		Friend friend = new Friend("lily");
		sheep.setFriend(friend);
		System.out.println(sheep);
		Sheep sheep2 = (Sheep) sheep.clone();
		System.out.println(sheep2);
		
		friend.setName("yamy");
		System.out.println("原型类引用属性变化："+sheep);
		System.out.println("克隆类引用属性的引用地址不会随着变化："+sheep2);
		
		sheep.setFriend(new Friend("loki"));
		System.out.println("原型类引用属性变化："+sheep);
		System.out.println("克隆类引用属性的引用地址不会随着变化："+sheep2);
	}
}
