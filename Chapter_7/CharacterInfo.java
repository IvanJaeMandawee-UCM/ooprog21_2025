

public class CharacterInfo {

    public static void main(String[] args) {
        char Char_info = 'C'; 
        
        System.out.println("The character is " + Char_info);
        
        System.out.println(Char_info + " is uppercase");
        System.out.println(Character.isUpperCase(Char_info));
        
        System.out.println(Char_info + " is lowercase");
        System.out.println(Character.isLowerCase(Char_info));
        
        char lowerChar = Character.toLowerCase(Char_info);
        System.out.println("After toLowerCase(), Char_info is " + lowerChar);
        
        char upperChar = Character.toUpperCase(Char_info);
        System.out.println("After toUpperCase(), Char_info is " + upperChar);

        System.out.println(Char_info + " is a letter or digit");
        System.out.println(Character.isLetterOrDigit(Char_info));

        System.out.println(Char_info + " is not whitespace");
        System.out.println(!Character.isWhitespace(Char_info));
    }
}