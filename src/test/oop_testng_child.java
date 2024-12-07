package test;

import org.testng.annotations.Test;

public class oop_testng_child extends oop_testng_parent{

	@Test
	public void testRun() {
		doThis(); //Parent Class
		
		oop_testng_helper helper = new oop_testng_helper(10); //Parameterized Constructors
		System.out.println("Increment Value is : "+helper.increment());
		System.out.println("Decrement Value is : "+helper.decrement());
		
		System.out.println("Increment Value is : "+helper.multiplyTwo());
		System.out.println("Decrement Value is : "+helper.multiplyThree());
	}
}
