class Solution {
    public int mySqrt(int x) {
        if(x==1){
            return 1;
        }else{
            double precision = 0.00001;
            double racine = x / 2; 
            
            while (Math.abs(racine * racine - x) > precision) {
                racine = (racine + x / racine) / 2;
            }
            int result= (int) racine;
            return result;
        }
    }
}
