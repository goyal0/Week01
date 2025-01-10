import java.util.Scanner;

class RoundsToComplete5K {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        // Compute the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters
        double distanceToRun = 5000;

        // Calculate the number of rounds to complete the 5 km run
        double rounds = distanceToRun / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
