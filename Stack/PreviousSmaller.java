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
			if(stack.isEmpty()){
				stack.push(arr[i]);
				continue;
			}
		    while(!stack.isEmpty() && stack.peek()<arr[i]){
				list.add(arr[i]);
		        stack.pop();
		    }
		    stack.push(arr[i]);
		}
		while(!stack.isEmpty()){
			list.add(-1);
			stack.pop();
		}
		for(int i:list){
		    System.out.println(i);
		}
	}
}
