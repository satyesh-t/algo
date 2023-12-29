package ds.adt.linkedlists;

public class LinkedList <I extends Comparable<I>>{

    public Node<? extends Comparable<I>> head;

    public void add(I element){
        Node<? extends Comparable<I>> n=new Node<>(element,null);
        if(head==null){
            head=n;
            return;
        }
        Node<? extends Comparable<I>> curr=head;
        while (curr.getNext()!=null){
            curr=curr.getNext();
        }
        curr.setNext(n);
    }

    public Node<? extends Comparable<I>> getHead() {
        return head;
    }

    @Override
    public String toString() {
        return (head==null)?"null":head.toString();
    }
}
