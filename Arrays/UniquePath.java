import java.util.*;
class UniquePath{
    public static void main(String[] args) {
        int i,j;
        int a[][]={{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0}};
        int m=a.length;
        int n=a[0].length;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0)
                {
                    a[i][j]=1;
                }
                else
                {
                    a[i][j]=a[i-1][j]+a[i][j-1];
                }
            }
        }
        System.out.println(a[m-1][n-1]);
    }
}