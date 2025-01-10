import java.util.Scanner;

class WeightConversion {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = sc.nextDouble();

        // Convert pounds to kilograms using the given conversion factor
        double weightInKg = weightInPounds * 2.2;

        // Print the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);
    }
}
