package Day9;
import java.util.*;
public class SubSetSums {
   void func(int ind,int sum,ArrayList<Integer> arr,int n,ArrayList<Integer> sumSubSet){
        if(ind==n){
            sumSubSet.add(sum);
            return;
        }
        func(ind+1,sum+arr.get(ind),arr,n,sumSubSet);
        
        func(ind+1,sum,arr,n,sumSubSet);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
    ArrayList<Integer> sumSubSet=new ArrayList<>();
    func(0,0,arr,N,sumSubSet);
    Collections.sort(sumSubSet);
    return sumSubSet;
    } 
}
