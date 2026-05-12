class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        //int[] suffix = new int[nums.length];

        int leftProduct = 1;
        int rightProduct = 1;
        Arrays.fill(prefix, 1);
        for(int i=0;i<nums.length;i++){
            prefix[i] *= leftProduct;
            leftProduct*= nums[i];
            
            prefix[nums.length-i-1] *= rightProduct;
            rightProduct *= nums[nums.length-i-1];
        }
      
        return prefix;
    }
}  
