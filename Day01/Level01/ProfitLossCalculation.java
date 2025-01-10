class ProfitLossCalculation{
      public static void main(String[]args){
          //Cost price of item is
          int costPrice=129;
          //Selling Price of item is
          int sellingPrice=191;

          //calculating profit on item
          int profit=sellingPrice-costPrice;
           //calculating profit Percentage on item
          int profitPercentage =(profit/costPrice)*100;

          //Print value of Profit and Profit Percentage
          System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+profit+ "\n"+"The Profit is INR "+profit+" and the Profit Percentage is "+ profitPercentage ); 

      }
}