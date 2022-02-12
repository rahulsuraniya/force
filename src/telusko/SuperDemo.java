package telusko;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a=new A();
//		B b=new B(5);//
		
//		B b=new B();
//		b.show();		//super class is used to refer immedieate instance variable of parents class

		B b=new B();
		b.abc();
	}

}
class A{		//parent class
	
	public void abc() {
		System.out.println("A abc");
	}
	
//	int i=5;
	
//	public A() {
//		System.out.println("class A constructure");
//	}
//	
//	public A(int i) {
//		System.out.println("class A constructure para");
//	}
}

class B extends A{		//child class
	
	public void abc() {
		super.abc();
		System.out.println("B abc");
	}
	
//	int i=4;
//	public void show() {
//		System.out.println(super.i);
//	}
	
	
//	public B() {
//		System.out.println("class B constructure");
//	}
//	public B(int i) {
//		super(i);
//		System.out.println("class B constructure para");
//	}
}
