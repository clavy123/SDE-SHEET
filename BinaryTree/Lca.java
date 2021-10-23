import java.util.*;
class Node{
      int data;
      Node left,right;
      Node(int data){
          this.data=data;
          this.left=this.right=null;
      }
}
class Lca{
      Node root=null;
      public void traverse(Node root){
          if(root!=null){
              traverse(root.left);
              System.out.print(root.data+" ");
              traverse(root.right);
          }
      }
      public int lca(Node root,int n1,int n2){
          if(root==null){
              return 0;
          }
          if(root.data==n1 || root.data==n2){
              return 1;
          }
          int left=lca(root.left,n1,n2);
          int right=lca(root.right,n1,n2);
          if(left==1 && right==1){
             return left;
          }
          else if(left==1){
              return left;
          }
          return right;
      }
      public static void main(String[] args) {
          Lca obj=new Lca();
          obj.root=new Node(1);
          obj.root.left=new Node(2);
          obj.root.right=new Node(3);
          obj.root.left.left=new Node(4);
          obj.root.left.right=new Node(5);
          obj.root.right.left=new Node(6);
          obj.root.right.right=new Node(7);
          obj.traverse(obj.root);
          System.out.println();
          System.out.println(obj.lca(obj.root,4,6));
      }
}