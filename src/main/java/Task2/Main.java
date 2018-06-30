package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        String str = "The quick brown fox jumps over the lazy dog";

        System.out.println(str.contains("[a-zA-Z]"));

    }


    public boolean check(String sentence) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<String> list = new ArrayList<String>(Arrays.asList(alphabet));


        list.forEach(System.out::println);

        return true;
    }
}