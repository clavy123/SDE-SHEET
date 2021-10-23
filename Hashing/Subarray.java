import java.util.*;
class Subarray{
    public static void main(String[] args) {
        int arr[]={4,5,0,-2,-3,1};
        int k=5;
        HashMap<Integer,Integer> hash=new HashMap();
        hash.put(0,1);
        int sum=0;
        int rem=0;
        int ans=0;
        for(int 0;i<arr.length;i++){
           sum=sum+arr[i];
           rem=sum%k;
           if(rem<0){
               rem=rem+k;
           }
           if(hash.containsKey(rem)){
               ans=ans+hash.get(rem);
               hash.put(rem,hash.get(rem)+1);
           }
           else{
               hash.put(rem,1);
           }
        }
        System.out.println(rem);
    }
}