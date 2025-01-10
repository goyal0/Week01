import java.util.*;
class AreaOfTriangle{
	public static void main(String [] args){
		// Conversion factors
        final double INCH_TO_CM = 2.54;
        final double CM_TO_FEET = 0.0328084;

        	// taking input
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the base of the triangle in inches");
        	double baseInInches = sc.nextDouble();
        	double heightInInches = sc.nextDouble();

        	// Area of the triangle
        	double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        	// Convert to square centimeters
        	double areaInSquareCm = areaInSquareInches * Math.pow(INCH_TO_CM, 2);

        	// Convert height to different units
        	double heightInCm = heightInInches * INCH_TO_CM;
      		double heightInFeet = heightInCm * CM_TO_FEET;
		//display result
		System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+ heightInFeet+" and inches is "+ heightInInches);
	}
}