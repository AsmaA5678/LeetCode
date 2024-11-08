class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sHash = count(s);
        HashMap<Character, Integer> tHash = count(t);
        HashMap<Character, Character> mapSToT = new HashMap<>();
        HashMap<Character, Character> mapTToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (!sHash.get(charS).equals(tHash.get(charT))) {
                return false;
            }
            if (mapSToT.containsKey(charS)) {
                if (mapSToT.get(charS) != charT) {
                    return false; 
                }
            } else {
                mapSToT.put(charS, charT);
            }
            if (mapTToS.containsKey(charT)) {
                if (mapTToS.get(charT) != charS) {
                    return false;
                }
            } else {
                mapTToS.put(charT, charS);
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
