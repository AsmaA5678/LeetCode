class Solution {
    public boolean isHappy(int n) {
        if(n<=0){
            return false;
        }
        HashSet<Integer> numbers = new HashSet<>(); 
        int x = n;

        while (x != 1) {
            if (numbers.contains(x)) {
                return false;
            }
            numbers.add(x); 
            x = digitSquareSum(x); 
        }

        return true;
    }
    public static int digitSquareSum(int n) {
        int length = (int) (Math.log10(n) + 1); 
        int x = 0;

        for (int i = 0; i < length; i++) {
            int digit = (n / (int) Math.pow(10, i)) % 10; 
            x += Math.pow(digit, 2); 
        }
        return x;
}
}