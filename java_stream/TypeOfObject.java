package java_stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeOfObject {
    
    public static void main(String[] args) {
        Map<String , Object> f1 = new HashMap<String , Object>();
        List<String> f2 = new ArrayList<String>();

        System.out.println(f1.getClass().getName());
        System.out.println(f2.getClass().getName());
    }
}
