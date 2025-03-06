package personal;

import javax.xml.stream.events.Characters;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append('a');
        System.out.println(sb);

        // sb.append(null); //error as ambiguos

        // sb.append("bc", 2, 1); //IndexOutOfBoundException

        sb.append("bc", 0, 1); //Characters of the argument starting at index start, are appended up to the (exclusive) index end
        System.out.println(sb); //ab

        sb.append(new char[]{'c'});
        System.out.println(sb); //abc

        sb.append(new char[]{'d','e', 'f'}, 2, 1);
        //Characters of the char array str, starting at index offset, are appended, in order, 
        //to the contents of this sequence. The length of this sequence increases by the value of len
        System.out.println(sb); //abcf
    }
}
