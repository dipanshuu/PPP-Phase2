class Solution {
    public void nextPermutation(int[] nums) {
        int idx1=0;int idx2=0;
    for(int i=nums.length-1;i>0;i--){
        if(nums[i]>nums[i-1]){
            idx1=i-1;
        }
        
    }
        for(int j=nums.length-1;j>0;j--){
            if(nums[j]>nums[idx1]){
                idx2=j;
            }
        }
        int temp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;int m=0;
        for(int k=idx1+1;k<nums.length;k++){
            nums[k]=nums[nums.length-m-1];
            m=m+1;
        }
        
    }
}
