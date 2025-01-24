class Solution {
    public String intToRoman(int num) {
        int[] numbers = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        String[] letters = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        int number = num;
        String result = "";
        int i = numbers.length -1;
        while(number!=0){
            if(number<numbers[i]){
                i--;
            }else{
                number-=numbers[i];
                result+=letters[i];
            }
        }
        return result;
    }
}