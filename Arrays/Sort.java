import java.util.*;
class Sort{
     public static void main(String[] args){
         int arr[]={0,1,1,0,0,1,1,2,2,0,1,2,0,0};
         int n=arr.length;
         int mid=0;
         int end=n-1;
         int start=0;
         while(mid<=end){
             switch(arr[mid]){
                 case 0:{
                     int temp=arr[start];
                     arr[start]=arr[mid];
                     arr[mid]=temp;
                     start++;
                     mid++;
                     break;
                 }
                 case 1:{
                     mid++;
                     break;
                 }
                 case 2:{
                     int temp=arr[mid];
                     arr[mid]=arr[end];
                     arr[end]=temp;
                     end--;
                     break;
                 }
             }
         }
         for(int i:arr){
             System.out.print(i+" ");
         }
     }
}