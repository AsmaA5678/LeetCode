class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (pCount[i] == sCount[i]) matches++;
        }

        int l = 0;
        for (int r = p.length(); r < s.length(); r++, l++) {
            if (matches == 26) result.add(l);

            int indexIn = s.charAt(r) - 'a';
            int indexOut = s.charAt(l) - 'a';

            // Add new char
            sCount[indexIn]++;
            if (sCount[indexIn] == pCount[indexIn]) {
                matches++;
            } else if (sCount[indexIn] - 1 == pCount[indexIn]) {
                matches--;
            }

            // Remove old char
            sCount[indexOut]--;
            if (sCount[indexOut] == pCount[indexOut]) {
                matches++;
            } else if (sCount[indexOut] + 1 == pCount[indexOut]) {
                matches--;
            }
        }

        if (matches == 26) result.add(l); // check last window

        return result;
    }
}
