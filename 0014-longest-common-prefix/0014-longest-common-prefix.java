class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int minIndex = min(strs);
        int minLength = strs[minIndex].length();
        String result = "";

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < minLength; j++) {
                if (strs[minIndex].charAt(j) != strs[i].charAt(j)) {
                    minLength = j; 
                    break; 
                }
            }
        }

        if (minLength > 0) {
            result = strs[minIndex].substring(0, minLength);
        }
        return result;
    }

    public int min(String[] strs) {
        int minIndex = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < strs[minIndex].length()) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
