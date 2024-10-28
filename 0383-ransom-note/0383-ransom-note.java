class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomNoteCount = count(ransomNote);
        HashMap<Character, Integer> magazineCount = count(magazine);
         for (char c : ransomNoteCount.keySet()) {
            int x = ransomNoteCount.get(c);
            int y = magazineCount.getOrDefault(c, 0);
            if (x > y) {
                return false; 
            }
        }
        return true; 
    }

    
    public static HashMap<Character,Integer> count(String string){
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : string.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }
}