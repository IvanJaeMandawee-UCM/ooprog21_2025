
import javax.swing.JOptionPane;

public class JOptionPane_Dialog {

  public static void main(String[] args) {

    String name, tell, asking = "Ivan";
    int confirmation = 0, num = 1, age;
    int as_String;
        JOptionPane.showMessageDialog(null, "Hello I'm " + asking);
        JOptionPane.showMessageDialog(null, "How about you?");
    do {
      name = (JOptionPane.showInputDialog("What's your Name: "));
     
                 if (name == null) {
                             invalid(1);
                            confirmation += num;
                               
                      break;
                } else {
                        JOptionPane.showMessageDialog(null, "My name is " + name);
                        tell = JOptionPane.showInputDialog("What you Gonna say?");
                             
                                    
                 }           
                     confirmation = JOptionPane.showConfirmDialog(null, name + ": " + tell );
    } while (confirmation == 1);
      
      
    // Final User's Information
    JOptionPane.showMessageDialog(null, "Hello, How are you? " + name);

  }
     public static void invalid(int invalid) {
         JOptionPane.showMessageDialog(null, "Just answer my question, who are you?");
     }
 
}
