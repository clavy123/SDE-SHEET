import java.util.*;
class ZeroSum{
    public static void main(String[] args) {
        int arr[]={15, -2, 2, -8, 1, 7, 10, 23};
        int sum=0;
        HashMap<Integer,Integer> hash=new HashMap();
        hash.put(0,-1);
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
            if(hash.containsKey(sum)){
                 max=Math.max(max,i-hash.get(sum));
            }
            else{
                hash.put(arr[i],i);
            }
        }
        System.out.println(max);
    }
}