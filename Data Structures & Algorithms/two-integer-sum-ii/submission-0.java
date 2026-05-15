class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int left = 0;
        int right = length-1;
        int sum = numbers[left] + numbers[right];
        while( sum != target){
            while(sum > target){
                right--;
                sum = numbers[left] + numbers[right];
            }
            while(sum < target){
                left++;
                sum = numbers[left] + numbers[right];
            }
        }
        int[] solution = new int[2];
        solution[0] = ++left;
        solution[1] = ++right;
        return solution;
    }
}
