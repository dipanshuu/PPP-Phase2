import java.util.Scanner;
class setMatrixZero{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int m=sc.nextInt();
            int n=sc.nextInt();
            int mat[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]==0){
                        for(int k=0;k<n;k++){
                            mat[i][k]=-1;
                        }
                        for(int l=0;l<m;l++){
                            mat[l][j]=-1;
                        }
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]==-1){
                        mat[i][j]=0;
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(mat[i][j]);
                }
                System.out.println();
            }
            sc.close();
        }
    }

