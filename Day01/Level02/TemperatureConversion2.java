import java.util.Scanner;

class TemperatureConversion2 {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");

        // Take input for temperature in Fahrenheit
        double fahrenheit = sc.nextDouble();  

        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5/9;

        // Print the result
        System.out.println(fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

    }
}
