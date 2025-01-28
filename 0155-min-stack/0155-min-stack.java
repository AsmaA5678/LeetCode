class MinStack {

     ArrayList<Integer> S;
    public MinStack() {
         S= new ArrayList<>();
    }
    
    public void push(int val) {
        S.add(val);
    }
    
    public void pop() {
        S.remove(S.size()-1);
    }
    
    public int top() {
        int topStack=S.get(S.size()-1);
        return topStack;

    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<S.size();i++){
            if(S.get(i)<min){
                min=S.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */