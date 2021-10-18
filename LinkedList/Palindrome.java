import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
}
class Palindrome{
    Node head=null;
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
        return Prev;
    }
    public boolean checkPalindrome(Node head){
        Node start=head;
        Node head=head;
        while(end!=null && end.next!=null){
            start=start.next;
            end=end.next.next;
        }
        Node temp=reverse(head);
        Node dummy=head;
        while(temp!=null){
            if(dummy.data!=temp.data){
                return false;
            }
           temp=temp.next;
           dummy=dummy.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        obj.head=new Node(56);
        obj.head.next=new Node(57);
        obj.head.next.next=new Node(58);
        obj.head.next.next.next=new Node(59);
        obj.head.next.next.next.next=new Node(60);
        obj.head.next.next.next.next.next=new Node(61);
        obj.head.next.next.next.next.next.next=new Node(62);
        obj.head.next.next.next.next.next.next.next=null;
        obj.traverse(obj.head);
        boolean ans=obj.checkPalindrome(obj.head);
        System.out.print(ans);
    }
}