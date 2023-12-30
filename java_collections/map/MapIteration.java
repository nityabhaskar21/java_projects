package java_collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        // create a HashMap
        HashMap<String, Integer> prices = new HashMap<>();

        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("Normal Price: " + prices);

        // pass lambda expression to forEach()
        prices.forEach((key, value) -> {
            // decrease value by 10%
            value = value - value * 10/100;
            System.out.print(key + "=" + value + " ");
        });

        
        // using for-each loop for iteration over Map.entrySet() 
        for (Map.Entry<String,Integer> entry : prices.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
    }
}
