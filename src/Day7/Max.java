package Day7;

public class Max {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;int d=0;
   for(int i=0;i<nums.length;i++){
       if(nums[i]==0){
           max=Math.max(max,d);
           d=0;
       }
      
       else{
++d;
       }
        if(i==nums.length-1){
           max=Math.max(max,d);
       }
   }
        return max;
}
}
