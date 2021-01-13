package Study.DesignPattern.composite;

public class Test {
	public static void main(String[] args) {
		OrganComponent university = new University("耶鲁大学");
		
		OrganComponent grade1 = new Grade("高年级");
		OrganComponent grade2 = new Grade("低年级");
		
		OrganComponent klass1 = new Klass("一班");
		OrganComponent klass2 = new Klass("二班");
		OrganComponent klass3 = new Klass("三班");
		OrganComponent klass4 = new Klass("四班");
		
		university.addChild(grade1);
		university.addChild(grade2);
		
		grade1.addChild(klass1);
		grade1.addChild(klass2);
		grade2.addChild(klass3);
		grade2.addChild(klass4);
		
		university.listChild();
	}

}
