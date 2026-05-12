class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character a: s.toCharArray()){
            if(a.equals('[') || a.equals('(') || a.equals('{')){
                stack.push(a);
            }
            else if(!stack.isEmpty() && a.equals(']') && stack.peek() == '['){
                stack.pop();
            }
            else if(!stack.isEmpty() && a.equals('}') && stack.peek() == '{'){
                stack.pop();
            }
            else if(!stack.isEmpty() && a.equals(')') && stack.peek() == '('){
                stack.pop();
            }
            else{
                System.out.println("desilo se");
                return false;
            }
        }
        return stack.isEmpty();


    }
}
