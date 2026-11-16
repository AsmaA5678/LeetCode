class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1||numRows >= s.length()) return s;
        int numCols=(s.length() / (2 * numRows - 2) + 1) * (numRows - 1);
        char[][] result = new char[numRows][numCols];
        for (int r = 0; r < result.length; r++) {
            Arrays.fill(result[r], ' ');
        }
        int i=0;
        int j=0;
        int current=0;
        while(current!=s.length()){
            while(i<numRows && current<s.length()){
                result[i][j]=s.charAt(current);
                i++;
                current++;
            }
            i--;
            while(i>0 && current<s.length()){
                i--;
                j++;
                result[i][j]=s.charAt(current);
                current++;
            }
            i++;
        }
        StringBuilder out=new StringBuilder();
        for(int r=0;r<result.length;r++){
            for(int c=0;c<result[0].length;c++){
                if(result[r][c]!=' '){
                    out.append(result[r][c]);
                }
            }
        }
        return out.toString();
    }
}

