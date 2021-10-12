import java.util.*;
class Kadane{
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int max_so_end=0;
        int max_so_far=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max_so_end=max_so_end+arr[i];
            if(max_so_far<max_so_end){
                max_so_far=max_so_end;
            }
            if(max_so_end<0){
                max_so_end=0;
            }
        }
       System.out.println(max_so_far);
    }
}