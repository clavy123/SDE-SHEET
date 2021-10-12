import java.util.*;
class TwoSum{
    public static void main(String[] args) {
        int arr[]={0, -1, 2, -3, 1};
        int sum=-2;
        HashMap<Integer,Integer> hash=new HashMap();
        for(int i=0;i<arr.length;i++){
            int temp=sum-arr[i];
            if(hash.containsKey(temp)){
               System.out.println(i+" "+hash.get(temp));

            }
            hash.put(arr[i],i);
        }
    }
}