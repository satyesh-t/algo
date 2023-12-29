package ds.adt.linkedlists;

public class Node<I extends Comparable<I>> {

    private I data;
    private Node next;

    public Node(I data, Node next) {
        this.data = data;
        this.next = next;
    }

    public I getData() {
        return data;
    }

    public void setData(I data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String toString() {
        return "[" + data + "]->" + ((next == null) ? "null" : next.toString());
    }
}
