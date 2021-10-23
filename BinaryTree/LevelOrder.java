import java.util.*;
class Node{
      int data;
      Node left,right;
      Node(int data){
          this.data=data;
          this.left=this.right=null;
      }
}
class LevelOrder{
      Node root=null;
      public void levelorder(Node root){
          Queue<Node> q=new LinkedList<Node>();
          q.add(root);
          while(!q.isEmpty()){
                  Node temp=q.poll();
                  System.out.println(temp.data);
                  if(temp.left!=null){
                      q.add(temp.left);
                  }
                  if(temp.right!=null){
                      q.add(temp.right);
                  }
                }
      }
      public static void main(String[] args) {
          LevelOrder obj=new LevelOrder();
          obj.root=new Node(1);
          obj.root.left=new Node(2);
          obj.root.right=new Node(3);
          obj.root.left.left=new Node(4);
          obj.root.left.right=new Node(5);
          obj.root.right.left=new Node(6);
          obj.root.right.right=new Node(7);
          obj.levelorder(obj.root);
      }
}