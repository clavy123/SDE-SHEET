import java.util.*;
class Node{
      int data;
      Node left,right;
      Node(int data){
          this.data=data;
          this.left=this.right=null;
      }
}
class ZigZag{
      Node root=null;
      public void zigzag(Node root){
          Stack<Node> s1=new Stack();
          Stack<Node> s2=new Stack();
          s1.push(root);
          boolean track=true;
          while(!s1.isEmpty()){
            Node temp=s1.pop();
            System.out.println(temp.data);
               if(track){
                   if(temp.left!=null){
                       s2.push(temp.left);
                   }
                   if(temp.right!=null){
                       s2.push(temp.right);
                   }
               }
               else{
                if(temp.right!=null){
                    s2.push(temp.right);
                }
                if(temp.left!=null){
                    s2.push(temp.left);
                }
               }
               if(s1.isEmpty()){
                   track=false;
                   Stack<Node> swap=s1;
                   s1=s2;
                   s2=swap;
                 
               }
          }
      }
      public static void main(String[] args) {
          ZigZag obj=new ZigZag();
          obj.root=new Node(1);
          obj.root.left=new Node(2);
          obj.root.right=new Node(3);
          obj.root.left.left=new Node(4);
          obj.root.left.right=new Node(5);
          obj.root.right.left=new Node(6);
          obj.root.right.right=new Node(7);
          obj.zigzag(obj.root);
      }
}