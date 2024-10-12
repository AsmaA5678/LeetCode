class Solution {
    public int romanToInt(String s) {
        int result=0;
        char[] ch= s.toCharArray();
        for(int i=0; i<ch.length-1; i++){
            int current= romanValue(ch[i]);
            int next= romanValue(ch[i+1]);
            if(current<next){
                result-=current;
            }else{
                result+=current;
            }
            result+=romanValue(ch[ch.length-1]);
            return result;
        }

    }
    public int romanValue(char c){
        switch(c){
            case 'I':
               return 1;
            case 'V':
               return 5;
            case 'X':
               return 10;
            case 'L':
               return 50;
            case 'C':
               return 100;
            case 'D':
               return 500;
            case 'M':
               return 1000;
            default :
               return 0;
        }
     } 
}