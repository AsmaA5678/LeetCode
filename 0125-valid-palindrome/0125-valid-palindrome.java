class Solution {
    public boolean isPalindrome(String s) {
        String text = cleanString(s);
        String lowerText = text.toLowerCase();
        for (int i = 0; i < lowerText.length() / 2; i++) {
            if (lowerText.charAt(i) != lowerText.charAt(lowerText.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String cleanString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
