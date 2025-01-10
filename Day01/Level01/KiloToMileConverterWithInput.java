import java.util.*; 
class KiloToMileConverterWithInput{
      public static void main(String[]args){
         //taking Input
         Scanner sc=new Scanner(System.in);
          Double km=sc.nextDouble();

         //convert km to mile 
         double mile=km/1.6;
          
          //Display the result
          System.out.println("The total miles is "+mile+" mile for the given "+km+" km");
      }
   }