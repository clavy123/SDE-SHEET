import java.util.*;
class Duplicate{
    public static void main(String[] args){
        int arr[]={1,4,4,4,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[arr[i]%n]=arr[arr[i]%n]+n;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=n*2){
                System.out.print(i+" ");
            }
        }
    }
}