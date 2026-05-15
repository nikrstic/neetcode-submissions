class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int totalAmount;
        int maxAmount = 0;
        
        while(left!= right){
            if(heights[left] < heights[right]){
                totalAmount = heights[left] * (right-left); 
                left++;
            }
            else{
                totalAmount = heights[right] * (right-left); 
                right--;
            }
            if(totalAmount>maxAmount){
                maxAmount=totalAmount;
            }
            
            
        }
        return maxAmount;
    }
}
