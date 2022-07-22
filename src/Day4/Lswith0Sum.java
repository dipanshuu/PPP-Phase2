package Day4;
import java.util.*;
class Lswith0Sum
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> mpp=new HashMap<Integer,Integer>();
        int maxi=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==0){
                maxi=i+1;
            }
            else{
                if(mpp.get(sum)!=null){
                    maxi=Math.max(maxi,i-mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
        return maxi;
    }
}
