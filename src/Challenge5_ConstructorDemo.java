package Week1_OOPS_Feb172023;

public class Challenge5_ConstructorDemo {
	
	int vara;
	float varb;
	String varc;
	char vard;
	
	Challenge5_ConstructorDemo(){
		System.out.println("I am default constructor.");
	}
	
	Challenge5_ConstructorDemo(int a, float b,String c,char d){
		System.out.println("I am Parameterized constructor. I take various arguments as input.");
		vara = a;
		varb = b;
		varc = c;
		vard = d;
		
	}
	
	public void printinfo() {
		System.out.println(vara*vara);
		System.out.println(varb*varb);
		System.out.println(varc);
		System.out.println(vard);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Challenge5_ConstructorDemo c1 = new Challenge5_ConstructorDemo();
		Challenge5_ConstructorDemo c2 = new Challenge5_ConstructorDemo(10,(float) 2.5,"Hari",'M');
		c2.printinfo();
		
	}

}
