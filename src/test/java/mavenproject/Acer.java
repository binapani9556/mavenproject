package mavenproject;

import org.testng.annotations.Test;

public class Acer {

	public  void m1()
	{
		System.out.println("no argument method");
	}
	@Test
	public static void AcerPrint() {
		Acer ac=new Acer();
		ac.m1();
	}


}
