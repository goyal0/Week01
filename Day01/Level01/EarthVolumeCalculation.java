  class EarthVolumeCalculation{
      public static void main(String[]args){
          //radius of earth 
          int radius=6378;

          //Volume of Earth in Kilometer
          double volumeInKm=(4/3) * Math.PI * Math.pow(radius,3);

          //convert km to miles
          double radiusInMile= radius * 1.6;

          //Volume of Earth in miles
          double volumeInMile=(4/3) * Math.PI * Math.pow(radiusInMile,3);
          
          //Display the result
          System.out.println("The volume of earth in cubic kilometers is "+volumeInKm+" and cubic miles is "+volumeInMile);
      }
   }