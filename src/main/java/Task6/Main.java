package Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5};
        for (int i : test) {
            System.out.println(i);
        }
        System.out.println();
        test = beggars(test, 3);

        for (int i : test) {
            System.out.println(i);
        }

    }


    public static int[] beggars(int[] values, int n) {

        if (values.length == 0 || n == 0)
            return new int [0];

        List<List<Integer>> county = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            county.add(new ArrayList<>());
        }

        for (int i = 0, counter = 0; i < values.length; i++) {

            county.get(counter).add(values[i]);

            if (counter == n-1) counter = 0;
            else counter++;

        }
        List<Integer> sumy = county.stream().map(p -> p.stream()
                .mapToInt(value -> value).sum())
                .collect(Collectors.toList());

        return sumy
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }
}