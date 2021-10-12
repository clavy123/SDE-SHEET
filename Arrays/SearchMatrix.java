import java.util.*;
class SearchMatrix{
    public static void main(String[] args) {
        int mat[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
                int start=0;
                int end=n-1;
                while(start<=end){
                  int middle=(start+end)/2;
                  if(mat[i][middle]==target){
                      System.out.println(mat[i][middle]+" "+"found");
                      break;
                  }
                  else if(mat[i][middle]<target){
                      start=middle+1;
                  }
                  else{
                     end=middle-1;
                  }
                }
            }
        }
        
    }