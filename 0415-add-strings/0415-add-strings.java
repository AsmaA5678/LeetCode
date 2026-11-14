class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result=new StringBuilder();
        int n=num1.length();
        int m=num2.length();
        int i=n-1;
        int j=m-1;
        int carry=0;
        while(i>=0 || j>=0){
            int current1=(i>=0)?num1.charAt(i)-'0':0;
            int current2=(j>=0)?num2.charAt(j)-'0':0;
            int sum=current1+current2+carry;
            carry=sum/10;
            result.append(sum%10);
            i--;
            j--;
        }
        if(carry!=0) result.append(carry);

        return result.reverse().toString();
        
    }
}