class Solution {
    public int tribonacci(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(i==0){
                list.add(0);
            }else if(i==1 || i==2){
                list.add(1);
            }else{
                list.add(list.get(i-3)+list.get(i-2)+list.get(i-1));
            }
        }
        return list.get(n);
    }
}