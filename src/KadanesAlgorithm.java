class KadanesAlgorithm {
    public int maxSubArray(int[] nums) {
       int a=Integer.MIN_VALUE;
        int b=0;
        if(nums.length>1){
        for(int i=0;i<nums.length;i++){
            b=b+nums[i];
            if(b<0){
                b=0;
            }
            if(a<b){
                a=b;
            }
        }
        return a;
    }
        else{
            return nums[0];
        }
    
}
}
