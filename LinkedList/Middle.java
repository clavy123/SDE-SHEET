import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
}
class Middle{
    Node head=null;
    public void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void middle(Node head){
        Node start=head;
        Node end=head;
        while(start!=null && end!=null && end.next!=null){
            start=start.next;
            end=end.next.next;
        }
        System.out.println(start.data);
    }
    public static void main(String[] args) {
        Middle obj=new Middle();
        obj.head=new Node(56);
        obj.head.next=new Node(57);
        obj.head.next.next=new Node(58);
        obj.head.next.next.next=new Node(59);
        obj.head.next.next.next.next=new Node(60);
        obj.head.next.next.next.next.next=new Node(61);
        obj.head.next.next.next.next.next.next=new Node(62);
        obj.head.next.next.next.next.next.next.next=null;
        obj.traverse(obj.head);
        obj.middle(obj.head);
    }
}