class Solution {
    public int lengthOfLastWord(String s) {
        int lastindex=lastword(s);
        int index=lastword(s);
        while(s.charAt(index)!=' '){
            index--;
        }
        return lastindex-index;
    }
    public int lastword(String s){
        int i=s.length()-1;
        while(s.charAt(i)==' '){
            i--;
        }
        return i;
    }
    
}
