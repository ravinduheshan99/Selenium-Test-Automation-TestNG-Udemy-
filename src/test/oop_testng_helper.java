package test;

public class oop_testng_helper extends oop_testng_helper2{
	
	int value;
	
	public oop_testng_helper(int value) {
		super(value); //Parent Class Constructor is Invoked
		this.value=value;
	}
	
	public int increment() {
		value=value+1;
		return value;
	}
	
	public int decrement() {
		value=value-1;
		return value;
	}

}
