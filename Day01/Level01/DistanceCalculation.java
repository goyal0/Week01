import java.util.*;
class DistanceCalculation{
	public static void main(String [] args){
        	// taking input
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the distance in Feet");
        	double distanceInFeet = sc.nextDouble();
        
        	// converting feet to yard
        	double distanceInYard = distanceInFeet/3;
		// converting yard to mile
        	double distanceInMile = distanceInYard/1760;

        	//display result
		System.out.println("The distance in yard is "+distanceInYard+" in mile is "+distanceInMile+" and in feet is "+distanceInFeet);
	}
}