package Week1_OOPS_Feb172023;

public class Challenge8_StaticDemo {
	
	int var1 = 10;
	static int var2 = 10;
	
	void method1() {
		var1++;
		System.out.println(var1);
	}
	
	void method2() {
		var2++;
		System.out.println(var2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Challenge8_StaticDemo obj1 = new Challenge8_StaticDemo();
		Challenge8_StaticDemo obj2 = new Challenge8_StaticDemo();
		Challenge8_StaticDemo obj3 = new Challenge8_StaticDemo();
		
		System.out.println("Obj1-Method1");
		obj1.method1();
		System.out.println("Obj2-Method1");
		obj2.method1();
		System.out.println("Obj3-Method1");
		obj3.method1();
		System.out.println("Obj1-Method2");
		obj1.method2();
		System.out.println("Obj2-Method2");
		obj2.method2();
		System.out.println("Obj3-Method2");
		obj3.method2();
		
		
	}

}
