import java.util.Scanner;

class TravelDetails {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your city of origin: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the city you are traveling via: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter your destination city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter the total time taken for the journey in hours: ");
        double timeTaken = sc.nextDouble();

        // Calculate the total distance and average speed
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        // Print the result
        System.out.println("Traveler: " + name);
        System.out.println("From: " + fromCity + " to " + viaCity + " to " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " miles per hour");

    }
}
