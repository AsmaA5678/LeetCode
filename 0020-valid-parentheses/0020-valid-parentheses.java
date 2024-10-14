class Solution {
    public boolean isValid(String s) {
       char[]  ch=s.toCharArray();
       List<Character> par = new ArrayList<>(); 
        for (int i=0; i<ch.length;i++){
            char c = ch[i];
            if(c=='[' || c=='{'|| c=='(' ){
                par.add(c);
            }else{
                if(par.isEmpty()){
                    return false;
                }
                char last = par.get(par.size()-1);
                if((c==']' && last=='[')||(c=='}' && last=='{' )|| (c==')' && last=='(' ) ){
                par.remove(par.size()-1);
                }
                else {
                    return false;
                }
            }
        }
        return par.isEmpty();
    }
}