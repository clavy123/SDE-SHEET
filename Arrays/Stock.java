import java.util.*;
class Stock{
    public static void main(String[] args) {
        int arr[]={4,2,2,2,4};
        int prev=arr[0];
        int max=0;
        for(int i=1;i<arr.length;i++){
            int profit=arr[i]-prev;
            max=Math.max(profit,max);
            prev=Math.min(arr[i],prev);
        }
        System.out.println(max+" "+prev);
    }
}