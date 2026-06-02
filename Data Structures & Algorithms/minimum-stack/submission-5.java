class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>(); 
    }
    
    public void push(int val) {
        this.stack.push(val);
        if( minStack.isEmpty() || minStack.getFirst() >= val){
            minStack.push(val);
        }
        
    }
    
    public void pop() {
        if(this.minStack.getFirst().equals(this.stack.getFirst()) ){
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peekFirst();
    }
    
    public int getMin() {
        return minStack.peekFirst();
    }
}
