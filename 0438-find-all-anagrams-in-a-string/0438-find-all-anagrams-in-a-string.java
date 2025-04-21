import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Initialize the counts
        for (int i = 0; i < pLen; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // Compare initial window
        if (matches(pCount, sCount)) result.add(0);

        // Slide the window
        for (int i = pLen; i < sLen; i++) {
            sCount[s.charAt(i) - 'a']++; // Add new char
            sCount[s.charAt(i - pLen) - 'a']--; // Remove old char

            if (matches(pCount, sCount)) result.add(i - pLen + 1);
        }

        return result;
    }

    // Helper method to compare two arrays
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
