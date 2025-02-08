class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentChar = board[i][j];

                if (currentChar == '.') {
                    continue;
                }

                String rowKey = currentChar + " in row " + i;
                String colKey = currentChar + " in col " + j;
                String squareKey = currentChar + " in square " + (i / 3) + "-" + (j / 3);

                if (seen.contains(rowKey) || seen.contains(colKey) || seen.contains(squareKey)) {
                    return false; 
                }

                seen.add(rowKey);
                seen.add(colKey);
                seen.add(squareKey);
            }
        }

        return true;
    }
        
    }
