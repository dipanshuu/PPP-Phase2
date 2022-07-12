class Solution {
    public List<List<Integer>> generate(int numRows) {
  List<List<Integer>> a=new ArrayList<List<Integer>>();
        List<Integer> b,c=null;
        for(int i=0;i<numRows;i++){
            b=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if((j==0)||(j==i)){
             b.add(1);       
                }
                else{
                    b.add(c.get(j-1)+c.get(j));
                }
            }
            c=b;
            a.add(b);
        }
        return a;
    }
}