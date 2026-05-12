class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet();
        for(int i: nums){
            numbers.add(i);
        }
        return numbers.size()!=nums.length;
    
    }
}