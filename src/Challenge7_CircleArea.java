package Week1_OOPS_Feb172023;

public class Challenge7_CircleArea {
	
	final static double pi = 3.14;
	
	public static double area(double r) {
		
		return pi*r*r;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;
		area = Challenge7_CircleArea.area(2);
		System.out.print(area);
	}

}
