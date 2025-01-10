  class FeeCalculation{
      public static void main(String[]args){
          //Student fee
          int fee=125000;
          //10% discount on fee
          int discountAmount=(fee*10)/100;
          //fee After giving discount
          int finalFee=fee-discountAmount;
          
          //Display the result
          System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+finalFee);
      }
   }