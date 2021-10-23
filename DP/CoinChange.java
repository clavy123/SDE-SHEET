import java.util.*;
class CoinChange{
     public static void main(String[] args) {
        int coins[]={2,5,10,1};
        int n=27;
        int dp[][]=new int[coins.length+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(i==1){
                    if(j%coins[0]==0){
                        dp[i][j]=j/coins[0];
                    }
                    else{
                        dp[i][j]=0;
                    }
                }
                else if(coins[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }

            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print(dp[dp.length-1][dp[0].length-1]);
     }
}