class PensDistribution{
      public static void main(String[]args){
          //total pens
          int totalPen=14;
          //number of Student
          int totalStudent=3;
          

          //finding how many pens each student will get and remaining non-distributed pens
          int studentPen=totalPen/totalStudent;
          int penRemain=totalPen%totalStudent;
          System.out.println("The Pen Per Student is "+studentPen+" and the remaining pen not distributed is "+penRemain);
      }
}