class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int x = 0;
                int y = i;
                while (x < needle.length()  && y < haystack.length()  && haystack.charAt(y)==needle.charAt(x)) {
                    y++;
                    x++;
                }
                if (x == needle.length()) {
                    return y - x;
                }
            }
        }
        return -1;
    }
}
