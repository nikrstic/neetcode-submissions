class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int max = 0;
        int current = 0;
        int last = -1;
        for(int num: set ){

            if(!set.contains(num-1)){
                current=0;
                int i = 0;
                while(set.contains(num+i)){
                    current++;    
                    i++;
                }
            }
            if(current>max){
                max = current;
            }
        }
        return max;
    }
}
