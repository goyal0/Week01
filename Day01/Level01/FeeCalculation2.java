import java.util.*;
  class FeeCalculation2{
      public static void main(String[]args){
          //taking input
          Scanner sc=new Scanner(System.in);
          System.out.println("enter fee and discount");
          double fee=sc.nextInt();
          double discount=sc.nextInt();

          //calculating disscount amount
          double discountAmount=(fee*discount)/100;

          //fee After giving discount
          double finalFee=fee-discountAmount;
          
          //Display the result
          System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+finalFee);
      }
   }