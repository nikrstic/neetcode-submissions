class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solution = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    ArrayList<Integer> lista =new ArrayList<>(List.of(nums[i], nums[left], nums[right]));
                    solution.add(lista);
                    left++;
                    right--;
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                }
                if(sum>0){
                    right--;
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                if(sum<0){
                    left++;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                }
            }
        }
        return solution;  
    }
}
