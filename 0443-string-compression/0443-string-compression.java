class Solution {
    public int compress(char[] chars) {
        int i=0;
        int write=0;
        while(i<chars.length){
            int j=i;
            int count=0;
            while(j<chars.length && chars[j]==chars[i]){
                count++;
                j++;
            }
            chars[write]=chars[i];
            write++;
            if(count>1){
                String s = String.valueOf(count);
                for (int c = 0; c < s.length(); c++) {
                    chars[write + c] = s.charAt(c);
                }
                write+=s.length();
            }
            i=j;     
        }
        return  write;
    }
}
