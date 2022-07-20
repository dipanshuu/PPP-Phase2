class MajorityN2 {
    public int majorityElement(int[] nums) {
          int n=nums.length/2;
        int e=0;
        for(int i=0;i<nums.length;i++){
            e=0;
          for(int j=0;j<nums.length;j++){
              if(nums[i]==nums[j]){
                  ++e;
              }
          }
            if(e>n){
                return nums[i];
            }
            
        }
        return -1;
    }
}
