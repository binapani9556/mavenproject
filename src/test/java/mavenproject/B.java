package mavenproject;

public class B extends A{
	
	public B() {
		System.out.println("B cons executed");
	}
	
	public void method1() {
		System.out.println("method1 override");
	}
	
	public static void main(String[] args) {
		//A objA = new A();
		System.out.println("===========CHILD OBJ====================");
		B objB = new B();
		objB.method1();
		System.out.println("========PARENT=======================");	
		A objA = new A();
		objA.method1();
		System.out.println("============UPCAST===================");
		A upcSTA = new B();
		upcSTA.method1();
		
	}

}
