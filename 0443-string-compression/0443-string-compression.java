class Solution {
    public int compress(char[] chars) {
        int start=0;
        int end=0;
        int index=0;
        while(end<chars.length){
            char currentChar=chars[start];
            while(end<chars.length && chars[end]==currentChar){
                end++;
            }
            int count=end-start;
            chars[index++]=currentChar;
            if(count>1){
                String countStr=String.valueOf(count);
                for(char c: countStr.toCharArray()){
                    chars[index++]=c;
                }
            }
            start=end;
            
        }
        return index;


    }
}