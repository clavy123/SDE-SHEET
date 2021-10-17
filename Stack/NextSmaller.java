import java.util.*;
class NextSmaller{
    public static void main(String[] args) {
        int arr[]={4,10,5,18,3,12,7};
		Stack<Integer> stack=new Stack();
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty())
            {
                   while(!stack.isEmpty() && stack.peek()>=arr[i]){
                       stack.pop();
                      }
            } 
            if(stack.isEmpty()){
                hash.put(arr[i],-1);
            }
            else{
                hash.put(stack.peek(),arr[i]);
            }
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            hash.put(stack.peek(),-1);
            stack.pop();
        }
        for(Map.Entry map:hash.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}