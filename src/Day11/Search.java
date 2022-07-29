package Day11;

public class Search {
    public int search(int[] nums, int target) {
        int k=0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]>nums[i+1]){
            k=i;
        }
    }
        int low=0;int high=k;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        int l1=k+1;int h1=nums.length-1;
        while(l1<h1){
            mid=(l1+h1)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l1=mid+1;
            }
            else{
                h1=mid-1;
            }
        }
        return -1;
    }
}
