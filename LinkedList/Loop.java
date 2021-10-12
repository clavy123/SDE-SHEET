import java.util.*;
class Node{
    int data;
    Node next;
    int flag;
    Node(int data){
      this.data=data;
      this.next=null;
      this.flag=0;
    }
}
class Loop{
    Node head=null;
    public void loop(Node head){
        Node start=head;
        Node end=head;
        while(start!=null && end!=null && end.next!=null){
            start=start.next;
            end=end.next.next;
            if(start==end){
                System.out.println(start.data+" "+"Loop");
                break;
            }
        }
    }
    public void loop2(Node head){
        Node temp=head;
        while(temp!=null){
            if(temp.flag==1){
                System.out.println(temp.data+" "+"Loop2");
                break;
            }
            temp.flag=1;
            temp=temp.next;
        }
    }
    public void loop3(Node head){
        HashMap<Node,Integer> hash=new HashMap<Node,Integer>();
        Node temp=head;
        while(temp!=null){
            if(hash.containsKey(temp)){
                System.out.println(hash.get(temp)+" "+"Loop3");
                break;
            }
            hash.put(temp,temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Loop obj=new Loop();
        obj.head=new Node(56);
        obj.head.next=new Node(57);
        obj.head.next.next=new Node(58);
        obj.head.next.next.next=new Node(59);
        obj.head.next.next.next.next=new Node(60);
        obj.head.next.next.next.next.next=obj.head;
        obj.loop(obj.head);
        obj.loop2(obj.head);
        obj.loop3(obj.head);
    }
}