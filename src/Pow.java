class Pow {
    public double myPow(double x, int n) {
    
        double p=1.0;
        int p1=Math.abs(n);
        for(int i=1;i<=p1;i++){
            p=p*x;
        }
        if(n>0){
        return p;
        }
        else{
            return (1/p);
        }
       
        }
    }

