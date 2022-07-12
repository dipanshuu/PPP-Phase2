import java.util.* ;
import java.io.*; 
public class SetMatrixZeroes {
    public static void setZeros(int matrix[][]) {
       
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix[0].length;k++){
                        matrix[i][k]=-1;
                    }
                    for(int l=0;l<matrix.length;l++){
                        matrix[l][j]=-1;
                    }
                }
            }
            
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }

}