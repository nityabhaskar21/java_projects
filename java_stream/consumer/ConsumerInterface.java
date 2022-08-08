package java_stream.consumer;

import java.util.Arrays;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<Integer> c1 = c -> System.out.println(c);
        c1.accept(4);
        
        BiConsumer<String, String> c2 = (key, value) -> System.out.println(key+ " "+value);
        Arrays.asList(1,2,3).forEach(c1);

        //Foreach takes consumer
        Map.of("key1", "value1", "key2", "value2").forEach(c2); 
    }
    
}