class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int curr1=(i>=0)?num1.charAt(i)-'0':0;
            int curr2=(j>=0)?num2.charAt(j)-'0':0;
            int sum=curr1+curr2+carry;
            result.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
        
    }
}