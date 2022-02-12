package telusko;
//final keyword used with variable method class.

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.show();
	}

}
class Parent{
	final public void show() {
		System.out.println("in Parent show");
	}
}

class Child extends Parent{
//	public void show() {				//by the use of final keyword in parent's methoed
//		System.out.println("in Child"); // we can not method overriding in child class.
//	}
}
