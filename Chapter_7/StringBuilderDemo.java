
import java.lang.StringBuilder;

public class StringBuilderDemo {

    public static void main(String[] args) {
        String name = "Barbara";
        StringBuilder nameString = new StringBuilder(name);

        String address = "6311 Hickory Nut Grove Road";
        StringBuilder addressString = new StringBuilder(address);

        System.out.println("(StringBuilder 1) nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity());

        System.out.println("(StringBuilder 2) addressString: " + addressString);
        System.out.println("Capacity of addressString is: " + addressString.capacity());

        nameString.setLength(20);

        addressString.setLength(20);

        System.out.print("(Lenght set to 20 for StringBuilder 1) The name is " + nameString + "end\n");
        System.out.println("(Lenght set to 20 for StringBuilder 2) The address is " + addressString);
    }
}