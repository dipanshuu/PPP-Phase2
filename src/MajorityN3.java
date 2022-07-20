import java.util.*;
class MajorityN3 {
    public List<Integer> majorityElement(int[] nums) {
      List<Integer> a=new ArrayList<>();
        int d=nums.length/3;int e=0;
        for(int i=0;i<nums.length;i++){
            e=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    ++e;
                }
            }
            if(e>d){
                a.add(nums[i]);
            }
        }
        HashSet<Integer> hset = new HashSet<Integer>(a);
        List<Integer> b
            = new ArrayList<Integer>(hset);
        return b;
    }
}
