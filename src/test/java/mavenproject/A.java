package mavenproject;

public class A {
	public A() {
		System.out.println("constructpr A executed");
		}
	public A(int a) {
		
		System.out.println("constructpr A int [ara executed");
		}
	
	

	public void method1() {
		System.out.println("method1 non parameter  executed");
	}
	public void method1(int a) {
		System.out.println("method1 int parameter  executed");
	}
	
	public void method1(int a, int b) {
		System.out.println("method1 int int  parameter  executed");
	}
	
	public void method1(int a, char b) {
		System.out.println("method1 int char parameter  executed");
	}

	public void method1(char a, char b) {
		System.out.println("method1 non parameter  executed");
	}
	
public static void main(String[] args) {
	A objA = new A(10);
	//objA.method1();
	System.out.println("baba+gudi");
	System.out.println("fula+gudi");
	System.out.println("modify ");
	System.out.println("selenium");
}

}
