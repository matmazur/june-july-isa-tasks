package Task5;

class Node<T> {
    public T data;
    public Node<T> next;

    Node(T data, Task5.Node next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this(data, null);
    }
}