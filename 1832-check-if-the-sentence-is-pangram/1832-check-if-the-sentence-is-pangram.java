class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] letters=new int[26];
        for(char c:sentence.toCharArray()){
            letters[c-'a']++;
        }

        for(int i=0;i<letters.length;i++){
            if(letters[i]==0){
                return false;
            }
        }
        return true;
    }
}