package java_collections.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraylistConstructors {
    public static void main(String[] args) {
        
        //Default constructor
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");

        //public ArrayList(int initialCapacity)
        List<String> names1 = new ArrayList<>(20);
        names1.add("John");
        names1.add("Jane");

        Set<String> namesSet = new HashSet<>();
        namesSet.add("Ned");
        namesSet.add("Catelyn");
        //public ArrayList(Collection<? extends E> c)
        List<String> list = new ArrayList<>(names);

        
    }
}
