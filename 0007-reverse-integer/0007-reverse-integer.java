class Solution {
    public int reverse(int x) {
      StringBuilder str=new StringBuilder();
      String inputString=Integer.toString(x);
      int start=0;
      if(inputString.charAt(0)=='-'){
        str.append('-');
        start++;
      }
      int end=inputString.length()-1;
      for(int i=end;i>=start;i--){
        str.append(inputString.charAt(i));
      }
	//Integer.parseInt(str.toString()); 
    long reversed = Long.parseLong(str.toString());
    if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
        return 0;
    }

    return (int) reversed;
    }
}