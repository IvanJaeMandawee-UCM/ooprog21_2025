


    public class TableAndChairs {

         public static void main(String[] args) {
       
          leanseat(4); 
          
            seat(6);  System.out.println();
  
            drawLegs(2); 
            drawLegs(2);
         } 
          
      public static void drawLegs(int legs) {
          System.out.println("X   X\tX\t X   X\t X");
    
       }
  
       public static void leanseat(int lean) {
          System.out.println("X\t\t\t X");
          System.out.println("X\t\t\t X");
          System.out.println("X\tXXXXXXXXXX\t X");
     
     
       }
       public static void seat(int Seat) {
              System.out.print("XXXXX");
             System.out.print("\tX\t X");
             System.out.print("   XXXXX");

           
       }
       
     }