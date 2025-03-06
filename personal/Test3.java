package personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0]=2;
        arr[1]=1;
        arr[2]=2;
        arr[3]=9;
        arr[4]=2;

        Map<Integer, Integer> mp = new HashMap<>();

        for (int num:arr) {
            if (mp.containsKey(num)) 
                mp.put(num, mp.get(num)+1);
            else mp.put(num, 1);
        }

        for (Map.Entry<Integer, Integer> pair: mp.entrySet()) {
            if (pair.getValue()>1) System.out.println(pair.getKey()+" is duplicate");
        }

        //arr.for
 
        List<Integer> arrList = new ArrayList<>();
        arrList.add(2);
        arrList.add(1);
        arrList.add(2);
        arrList.add(9);
        arrList.add(2);

        // arrList.sort();

        List<Integer> sortedArr = arrList.stream().sorted((i1, i2)->i1-i2)
                                .collect(Collectors.toList());

        System.out.println(sortedArr);

        sortedArr.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .filter(i -> i.getValue()>1)
        .map(i->i.getKey())
        .collect(Collectors.toList());



    }
}
