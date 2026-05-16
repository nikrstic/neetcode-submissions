class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        
        Stack<Integer> stack = new Stack<>();

        Integer value1, value2;

        for(String ch: tokens){
            if (ch.equals("+")){
                value1 = stack.pop();
                value2 = stack.pop();
                stack.push(value1+value2);
            }else if (ch.equals("-")){
                value2 = stack.pop();
                value1 = stack.pop();
                stack.push(value1-value2);
            }
            else if (ch.equals("*")){
                value1 = stack.pop();
                value2 = stack.pop();
                stack.push(value1*value2);

            }
            else if (ch.equals("/")){
                value2 = stack.pop();
                value1 = stack.pop();
                stack.push(value1/value2);
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }

        return stack.pop();
    }
}
