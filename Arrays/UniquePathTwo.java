import java.util.*;
class UniquePathTwo{
    public static void main(String[] args) {
        int grid[][]={{0,0,0},{0,1,0},{0,0,0}};
        int m=grid.length;
        int n=grid[0].length;
        grid[0][0]=1;
        for(int i=1;i<m;i++){
            if(grid[i][0]==0)
            {
                grid[i][0]=grid[i-1][0];
            }
            else{
                grid[i][0]=0;
            }
            
        }
        for(int j=1;j<n;j++){
            if(grid[0][j]==0){
                grid[0][j]=grid[0][j-1];
            }
            else{
                grid[0][j]=0;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]==0){
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
                else{
                    grid[i][j]=0;
                }
            }
        }
        System.out.print(grid[m-1][n-1]);
    }
}