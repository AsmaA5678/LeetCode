public class Solution {

    public int reverseBits(int num) {
        int result = 0;

        for (int i=0; i<32; i++) {
            int lastBit = num & 1;
            result = (result << 1) | lastBit;
            num >>>= 1;  
        }

        return result;
    }
}
