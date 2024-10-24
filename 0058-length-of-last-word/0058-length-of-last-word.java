class Solution {
    public int lengthOfLastWord(String s) {
        int a = lastWordIndex(s);

      
        int length = 0;
        for (int i = a; i >= 0; i--) {
            if (s.charAt(i) == ' ') { 
                break;
            }
            length++;
        }

        return length; 
    }

    public int lastWordIndex(String s) {
        int i = s.length() - 1; 

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        return i;
    }
}
