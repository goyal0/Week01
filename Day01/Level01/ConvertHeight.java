import java.util.*;
  class ConvertHeight {
      public static void main(String[]args){
          //taking input
          Scanner sc=new Scanner(System.in);
          System.out.println("enter height ");
          double height=sc.nextDouble();
          
          //convert cm to inches
          double inche=height/2.54;
          //convert cm to feet
          double feet =inche/12;
          
          //Display the result
          System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inche);
      }
   }