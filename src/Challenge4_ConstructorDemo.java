package Week1_OOPS_Feb172023;

public class Challenge4_ConstructorDemo {
	
	Challenge4_ConstructorDemo() {
		this(99);
		System.out.println("Default constructor Invoked");
	}
	
	Challenge4_ConstructorDemo(int a){
		System.out.println("Value passed to constructor is : "+a);
	}

}
