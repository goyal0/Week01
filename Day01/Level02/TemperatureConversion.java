import java.util.Scanner;

class TemperatureConversion {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");

         // Take input for temperature in Celsius
        double celsius = sc.nextDouble();  

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Print the result
        System.out.println("The "+celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

    }
}
