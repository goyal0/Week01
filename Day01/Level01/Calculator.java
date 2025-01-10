import java.util.*;
class Calculator{
	public static void main(String [] args){
		//taking input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no. for performing operation");
		double number1=sc.nextInt();
		double number2=sc.nextInt();

		//calculating addition,subtracting,multiplication and division
		double add=number1+number2;
		double subtract=number1-number2;
		double multiplication=number1*number2;
		double division=number1/number2;

		//display result
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+add+","+subtract+","+multiplication+" and "+division);
	}
}