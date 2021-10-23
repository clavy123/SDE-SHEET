import java.util.*;
class Knapsack{
    public static void main(String[] args) {
        int values[]={10,15,40};
        int weight[]={1,2,3};
        int total_weight=6;
        int dp[][]=new int[values.length+1][total_weight+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(weight[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.max(values[i-1]+dp[i-1][j-weight[i-1]],dp[i-1][j]);
                }
            }
        }
        System.out.print(dp[dp.length-1][dp[0].length-1]);

         
    }
}