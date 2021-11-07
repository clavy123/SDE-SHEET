class NumberLand{
    public void dfs(int [][]grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=1){
            return;
        }
        grid[r][c]=2;
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
    public static void main(String[] args) {
        int grid[][]={
            {1,1,1,1,0},
            {1,1,0,1,0},
            {1,1,0,0,0},
            {0,0,0,0,0},
        } 
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                   dfs(grid,i,j);
                   ans++;
                }
            }
        }
        System.out.println(ans);
    }
}