package java_collections.set;
import java.util.HashSet; 
import java.util.Iterator; 
import java.util.Set; 

public class SetIteration {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>(); // s.size() is 0.
        int size = s.size(); 
        System.out.println("Size before adding elements: " +size); 
     
     // Adding elements to set. 
        s.add("Orange"); // s.size() is 1.
        s.add("Red"); // s.size() is 2.
        s.add("Blue"); // s.size() is 3.
        s.add("Yellow"); // s.size() is 4.
        s.add("Green"); // s.size() is 5.

        // Iterating set in the forward direction.
        // Creating an Iterator object using iterator() method.
        Iterator<String> itr = s.iterator(); 
        System.out.println("Iteration using Iterator method"); 
        while(itr.hasNext())
        { 
            Object str = itr.next(); 
            // System.out.println(str); 
        }


        // Applying enhanced for loop to iterate over set.
        for(var it:s)
        { 
            System.out.println(it); 
        }

        //forEach loop in Java 1.8
        s.forEach(System.out::println); 

        s.stream().forEach(System.out::println);
    }
}
