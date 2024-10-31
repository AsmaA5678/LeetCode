class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character, Integer> sCount = count(s);
        HashMap<Character, Integer> tCount = count(t);
        for (char c : sCount.keySet()) {
            int x = sCount.get(c);
            int y = tCount.getOrDefault(c, 0);
            if (x > y) {
                return false;
            }
        }
        return true;
    }
    public static HashMap<Character, Integer> count(String string) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : string.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }
}