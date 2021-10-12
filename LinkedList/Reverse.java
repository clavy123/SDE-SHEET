import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
}
class Reverse{
    Node head;
    public void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public Node reverse(Node head){
        Node Current=head;
        Node Prev=null;
        Node Next;
        while(Current!=null){
            Next=Current.next;
            Current.next=Prev;
            Prev=Current;
            Current=Next;
        }
        head=Prev;
        return head;
    }
    public static void main(String[] args) {
        Reverse obj=new Reverse();
        obj.head=new Node(56);
        obj.head.next=new Node(57);
        obj.head.next.next=new Node(58);
        obj.head.next.next.next=new Node(59);
        obj.head.next.next.next.next=new Node(60);
        obj.head.next.next.next.next.next=new Node(61);
        obj.head.next.next.next.next.next.next=new Node(62);
        obj.head.next.next.next.next.next.next.next=null;
        Node newTraverse=obj.reverse(obj.head);
        obj.traverse(newTraverse);
    }
}