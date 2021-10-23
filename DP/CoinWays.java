import java.util.*;
class CoinWays{
     public static void main(String[] args) {
        int coins[]={2,5,3,6};
        int n=10;
        int dp[][]=new int[coins.length+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(j==0){
                    dp[i][j]=1;
                }
                else if(i==0){
                    dp[i][j]=0;
                }
                else if(coins[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
                }

            }
        }
        System.out.print(dp[dp.length-1][dp[0].length-1]);
     }
}