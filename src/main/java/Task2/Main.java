package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";
        String pangram2 = "You shall not pass!";


        System.out.println(check(str));

        System.out.println(check(pangram2));

    }

    public static boolean check(String sentence) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<String> list = new ArrayList<String>(Arrays.asList(alphabet.split("")));

        return list
                .stream()
                .allMatch(p -> (sentence.toLowerCase()).contains(p));
    }
}