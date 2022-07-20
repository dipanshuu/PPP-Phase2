class GridUniquePaths{
    
    public int countPaths(int m,int n,int i,int j){
        if((i==m-1)&&(j==n-1)) {
            return 1;
        }
        if((i==m)||(j==n)) {
            return 0;
        }
        else
        {
            return countPaths(m,n,i+1,j)+countPaths(m,n,i,j+1);
        }
    }
    public int uniquePaths(int m, int n) {
       int d=countPaths(m,n,0,0);
        return d;
    }
}
