package Day11;
public class NthRoot {
     public static double findNthRootOfM(int n, long m) {
    	// Write your code here.
       double low=1;
        double high=m;
        double mid=0.0;
        while((high-low)>1e-6){
            mid=(low+high)/2.0;
            if(Math.pow(mid,n)>m){
                high=mid;
            }
            else if(Math.pow(mid,n)<m){
                low=mid;
            }
            else{
                return mid;
            }
        }
        return mid;
    }
}
