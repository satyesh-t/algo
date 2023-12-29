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

    public void remove(I element){

        if(head ==null){
            return ;
        }
        if(head.getData().equals(element)){
            head=head.getNext();
        }
        else{
            Node<? extends Comparable<I>> curr=head;
            while(curr!=null && !curr.getData().equals(element)){
                curr=curr.getNext();
            }
            if(curr!=null){
                curr.setNext(curr.getNext());
            }
        }
    }

    public Node<? extends Comparable<I>> getHead() {
        return head;
    }

    @Override
    public String toString() {
        return (head==null)?"null":head.toString();
    }
}
