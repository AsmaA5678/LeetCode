import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            str.append(digits[i]);
        }
        
        BigInteger number = new BigInteger(str.toString());
        number = number.add(BigInteger.ONE);
        
        String newStr = number.toString();
        
        int[] result = new int[newStr.length()];
        for (int i = 0; i < newStr.length(); i++) {
            result[i] = newStr.charAt(i) - '0'; 
        }
        return result;
    }
}
