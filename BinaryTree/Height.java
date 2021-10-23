import java.util.*;
class Node{
      int data;
      Node left,right;
      Node(int data){
          this.data=data;
          this.left=this.right=null;
      }
}
class Height{
      Node root=null;
      public void traverse(Node root){
          if(root!=null){
              traverse(root.left);
              System.out.print(root.data+" ");
              traverse(root.right);
          }
      }
      public int height(Node root){
          if(root==null){
              return 0;
          }
              int l=1+height(root.left);
              int r=1+height(root.right);
              if(l>=r){
                  return l;
              }
              return r;
      }
      public static void main(String[] args) {
          Height obj=new Height();
          obj.root=new Node(1);
          obj.root.left=new Node(2);
          obj.root.right=new Node(3);
          obj.root.left.left=new Node(4);
          obj.root.left.right=new Node(5);
          obj.root.right.left=new Node(6);
          obj.root.right.right=new Node(7);
          obj.traverse(obj.root);
          System.out.println();
          System.out.println(obj.height(obj.root));
      }
}