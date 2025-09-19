

    public class DemoGrossPay {
    
          public static void main(String [] args) {
                //Display                         
                 calculateGross();
          }
        public static void calculateGross() {
             double hourlyrate = 22.75;
             double  hour1 = 10;
             double hour2 = 25;
             double hour3 = 37.5;
             double num1, num2;
             hourlyrate *= hour1; 
             System.out.print(hour1 + " hours at " + "22.75" + "per hour is " + hourlyrate + "\n");   
             num1 = hourlyrate * hour2;       
             System.out.print(hour2 + " hours at " + "22.75" + "per hour is " + num1 + "\n");                    
             num2 = hourlyrate * hour3;
             System.out.print(hour3 + " hours at " + "22.75" + "per hour is " + num2 + "\n");            
                               
                          System.exit(0);
        
        
        } 
    }