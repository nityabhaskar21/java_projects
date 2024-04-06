package java_collections.character;

public class CharacterClass1 {
    public static void main(String[] args) {
        Character char1 = new Character( 'g' );

        System.out.println(Character.isWhitespace('A'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));
  
        // ASCII value of tab
        System.out.println(Character.isWhitespace(9));
  
        System.out.println(Character.isWhitespace('9'));
    }
}
