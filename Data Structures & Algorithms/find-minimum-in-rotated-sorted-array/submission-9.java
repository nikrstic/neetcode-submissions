class Solution {
    public int findMin(int[] nums) {
        if(nums[nums.length-1] > nums[0] || nums.length == 1) return nums[0];

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left < right){
            mid = (right + left) /2;

            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }

            

        }
       return nums[left];
       
    }
}
