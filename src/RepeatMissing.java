public class RepeatMissing {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int nums[]=new int[2];
        int count[]=new int[A.length+1];
        for(int i=0;i<A.length;i++){
            count[A[i]]=count[A[i]]+1;
        }
        
        for(int j=0;j<count.length;j++){
          if(count[j]>1){
              nums[0]=j;
              
          }  
          if((count[j]==0)&&(j!=0)){
            
              nums[1]=j;
          }
        }
        return nums;
    }
}
