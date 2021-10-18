import java.util.*;
class PalindromeSubstring{
    public static void main(String[] args) {
        String s="abccbc";
        boolean dp[]=new boolean[s.length()][s.length()];
        for(int i=0;i<dp.length;i++){
            dp[i][i]=true;
        }
        for(int i=0;i<dp.length-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
            }
            else{
                dp[i][i+1]=false;
            }
        }
        for(int gap=3;gap<=s.length();gap++){
            for(int i=0,j=i+gap-1;<s.length;i++,j++){
                dp[i][j]=s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
            }
        }
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}