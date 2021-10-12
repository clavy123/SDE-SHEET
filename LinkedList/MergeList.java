import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
}
class MergeList{
    Node head;
    public void addLast(Node node){
         if(head==null){
          head=node;
         }
         else{
             Node temp=head;
             while(temp!=null){
                 temp=temp.next;
             }
             temp.next=node;
         }
    }
    public Node sortedList(Node head1,Node head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        if(head1.data<head2.data){
            head1.next=sortedList(head1.next,head2);
            return head1;
        }
        else{
            head2.next=sortedList(head1,head2.next);
            return head2;
        }
    }
    public void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        MergeList l1=new MergeList();
        MergeList l2=new MergeList();
        l1.addLast(new Node(1));
        l1.addLast(new Node(5));
        l1.addLast(new Node(7));
        l2.addLast(new Node(2));
        l2.addLast(new Node(3));
        l2.addLast(new Node(8));
        l1.head=l1.sortedList(l1.head,l2.head);
        l1.traverse(l1.head);

    }
}