package Task5;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {


        Function<Integer, Integer> f = sr -> sr * 2;

        Node<Integer> mapa = new Node<>(1, new Node<>(2, new Node<>(3)));


    }

    private static <T, R> Node<R> map(Node<T> head, Function<T, R> f) {
        return null;
    }


}



/*
Implement the method map, which accepts a linked list (head) and a mapping function, and returns a new linked list (head) where every element is the result of applying the given mapping method to each element of the original list.

Make sure you do not modify the original list!

For example: Given the list: 1 -> 2 -> 3, and the mapping function x => x * 2, map should return 2 -> 4 -> 6

Note: the list may be null and can hold any type of value.

 */