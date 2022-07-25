package Day9;
import java.util.*;
public class CombinationsS1 {
      public void func(int ind,int candidates[],int target,List<List<Integer>> a,List<Integer> ds){
     if(ind==candidates.length){
         if(target==0){
             a.add(new ArrayList<>(ds));
         }
         return;
     } 
      if(candidates[ind]<=target){
          ds.add(candidates[ind]);
          func(ind,candidates,target-candidates[ind],a,ds);
          ds.remove(ds.size()-1);
      }
      func(ind+1,candidates,target,a,ds);
  }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> a=new ArrayList<>();
        func(0,candidates,target,a,new ArrayList<>());
            return a;
    }
}
