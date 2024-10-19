class Solution {
    public int[] plusOne(int[] digits) {
        String str = "";
        for (int i = 0; i < digits.length; i++) {
            str += digits[i];
        }
        int number = Integer.parseInt(str) + 1;
        
        String newStr = Integer.toString(number);
        
        int[] result = new int[newStr.length()];
        
        for (int i = 0; i < newStr.length(); i++) {
            result[i] = newStr.charAt(i) - '0'; 
        }
        
        return result;
    }
}
