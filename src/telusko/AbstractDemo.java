package telusko;

public class AbstractDemo {

	public static void main(String[] args) {
		Iphone obj=new Iphone();
		SamsungS4 obj1=new SamsungS4();
		show(obj);
		show(obj1);
		
		// TODO Auto-generated method stub
//		MaheshPhone obj=new SureshPhone();
//		obj.move();
//		obj.call();
//		obj.cook();
//		obj.dance();
	}
	
	public static void show(Phone obj) {
		obj.showConfig();
	}

}

abstract class Phone{
	public abstract void showConfig();
}

class Iphone extends Phone{
	public void showConfig() {
		System.out.println("2 Gb,ISO 9.3");
	}
}

class SamsungS4 extends Phone{
	public void showConfig() {
		System.out.println("2 Gb, Lolipop");
	}
}




//abstract class MaheshPhone{
//	public void call() {
//		System.out.println("calling....");
//	}
//	public abstract void move();
//	public abstract void dance();
//	public abstract void cook();
//}
//
//abstract class RameshPhone extends MaheshPhone{
//	public void move() {
//		System.out.println("moving....");
//	}
//}
//
//class SureshPhone extends RameshPhone{
//	public void dance() {
//		System.out.println("Dancing....");
//	}
//	
//	public void cook() {
//		System.out.println("cooking...");
//	}
//}
