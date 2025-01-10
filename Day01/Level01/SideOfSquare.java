import java.util.*;
class SideOfSquare{
	public static void main(String [] args){
        	// taking input
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the perimeter of square");
        	double parameter = sc.nextDouble();
        
        	// clalculating side of square
        	double side = parameter/4;

        	//display result
		System.out.println("The length of the side is "+side+" whose perimeter is "+ parameter);
	}
}