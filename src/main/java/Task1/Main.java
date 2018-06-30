package Task1;
//https://www.codewars.com/kata/convert-a-linked-list-to-a-string/train/java
public class Main {

    public static void main(String[] args) {

        Node nod = new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))));

        System.out.println(stringify(nod));
    }

    public static String stringify(Node list) {
        return list == null ? "null" : list.getData() + " -> " + stringify(list.getNext());
    }
}
