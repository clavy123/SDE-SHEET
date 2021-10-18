import java.util.*;
public class PreviousSmaller
{
	public static void main(String[] args) {
		int arr[]={4,10,5,18,3,12,7};
		Stack<Integer> stack=new Stack();
		List<Integer> list=new ArrayList();
		list.add(-1);
		stack.push(arr[0]);
		for(int i=1;i<arr.length;i++){
		    while(!stack.isEmpty() && stack.peek()>=arr[i]){
		        stack.pop();
		    }
		    if(stack.isEmpty()){
		        list.add(-1);
		    }
		    else{
		        list.add(stack.peek());
		    }
		    stack.push(arr[i]);
		}
		for(int i:list){
		    System.out.println(i);
		}
	}
}
