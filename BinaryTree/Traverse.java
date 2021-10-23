import java.util.*;
class Node{
      int data;
      Node left,right;
      Node(int data){
          this.data=data;
          this.left=this.right=null;
      }
}
class Traverse{
      Node root=null;
      public void inorder(Node root){
          if(root!=null){
              inorder(root.left);
              System.out.print(root.data+" ");
              inorder(root.right);
          }
      }
      public void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
      public static void main(String[] args) {
          Traverse obj=new Traverse();
          obj.root=new Node(1);
          obj.root.left=new Node(2);
          obj.root.right=new Node(3);
          obj.root.left.left=new Node(4);
          obj.root.left.right=new Node(5);
          obj.root.right.left=new Node(6);
          obj.root.right.right=new Node(7);
          obj.inorder(obj.root);
          System.out.println();
          obj.preorder(obj.root);
          System.out.println();
          obj.postorder(obj.root);
      }
}