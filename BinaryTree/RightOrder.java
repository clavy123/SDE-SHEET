import java.util.*;
class Node{
      int data;
      Node left,right;
      Node(int data){
          this.data=data;
          this.left=this.right=null;
      }
}
class RightOrder{
      Node root=null;
      public void rightorder(Node root){
          Queue<Node> q=new LinkedList<Node>();
          q.add(root);
          while(!q.isEmpty()){
              int n=q.size();
              for(int i=1;i<=n;i++){
                  Node temp=q.poll();
                  if(i==n){
                      System.out.println(temp.data);
                  }
                  if(temp.left!=null){
                      q.add(temp.left);
                  }
                  if(temp.right!=null){
                      q.add(temp.right);
                  }
              }
          }
      }
      public static void main(String[] args) {
          RightOrder obj=new RightOrder();
          obj.root=new Node(1);
          obj.root.left=new Node(2);
          obj.root.right=new Node(3);
          obj.root.left.left=new Node(4);
          obj.root.left.right=new Node(5);
          obj.root.right.left=new Node(6);
          obj.root.right.right=new Node(7);
          obj.rightorder(obj.root);
      }
}