class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        
        int current = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[current].append(c);
            if (current == 0 || current == numRows - 1) {
                goingDown = !goingDown;
            }
            if (goingDown) {
                current += 1; 
            } else {
                current -= 1; 
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
