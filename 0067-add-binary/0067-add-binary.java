class Solution {
    public String addBinary(String a, String b) {
        int length = Math.max(a.length(), b.length());
        a = fillZerros(a, length);
        b = fillZerros(b, length);
        int c = 0;
        StringBuilder result = new StringBuilder();
        for(int i=length-1; i>=0; i--){
               int ai = a.charAt(i)-'0';
               int bi = b.charAt(i)-'0';

                int sum = ai+bi+c;
                c = sum/2;

                result.append(sum % 2);
        }
        if(c!=0) result.append(c);
        return result.reverse().toString();
    }
    public static String fillZerros(String str, int length){
        while(str.length()<length){
            str='0'+str;
        }
        return str;
    }
}