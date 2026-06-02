class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        int[] result = new int[temperatures.length];
        int resultPos = 0;
        for(int i=0; i<temperatures.length; i++){
            
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peekFirst()]){
                int prethodniDan = stack.pop();
                result[prethodniDan] = i - prethodniDan;
            }
           stack.push(i);

        }   
        return result;
        
        


    }
}
