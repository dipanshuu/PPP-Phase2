class ReversePairs {
    public int reversePairs(int[] nums) {
        int d=0;
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(i<j){
                if(nums[i]>(2*nums[j])){
                    ++d;
                }
            }
        }
    }
        return d;
    }
}
