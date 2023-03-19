package Week1_OOPS_Feb172023;

public class Challenge6_ThreeDimensionShape {
	
	double width;
	double depth;
	double height;
	
	Challenge6_ThreeDimensionShape(){
		width = 0;
		height = 0;
		depth = 0;
	}
	
	Challenge6_ThreeDimensionShape(double length){
		width = length;
		height = length;
		depth = length;
	}
	
	Challenge6_ThreeDimensionShape(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	
	public double calcVolume() {
		return width*height*depth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Challenge6_ThreeDimensionShape t1 = new Challenge6_ThreeDimensionShape();
		System.out.println(t1.calcVolume());
		Challenge6_ThreeDimensionShape t2 = new Challenge6_ThreeDimensionShape(2);
		System.out.println(t2.calcVolume());
		Challenge6_ThreeDimensionShape t3 = new Challenge6_ThreeDimensionShape(2,3,4);
		System.out.println(t3.calcVolume());

	}

}
