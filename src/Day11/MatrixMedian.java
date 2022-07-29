package Day11;
import java.util.*;
public class MatrixMedian {
    public int findMedian(int[][] A) {
        
          int B[]=new int[A.length+A[0].length];int k=0;
   for(int i=0;i<A.length;i++){
       for(int j=0;((j<A[0].length)&&(k<(A.length+A[0].length)));j++){
           B[k]=A[i][j];
           ++k;
       }
   }
   Arrays.sort(B);int l=(A.length+A[0].length)/2;;
   if((A.length+A[0].length)%2!=0){
   
   return B[l];
    }
    int m=l+1;
    
    return (B[l]+B[m])/2;
    }
}
