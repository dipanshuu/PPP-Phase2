import java.util.* ;
import java.io.*; 
public class InversionArray {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long d=0l;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   ++d;
               }
           }
        }
        return d;
    }
}