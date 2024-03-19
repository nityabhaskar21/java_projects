package personal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        // [4,8,10,3,6,1]
        // target=9

        List<List<Integer>> list = new ArrayList<>();
        int[] input = new int[] {4, 8, 10, 3, 6, 1};
        Set<Integer> set = new HashSet<>();
        int target=9;

        int n=input.length;

        for (int i=0; i<n; i++) {
            int currNumber = input[i];
            if (set.contains(target-currNumber)) {
                list.add(List.of(currNumber, target-currNumber));
            }
            set.add(currNumber);
        }

        System.out.println(list);
    }
}
