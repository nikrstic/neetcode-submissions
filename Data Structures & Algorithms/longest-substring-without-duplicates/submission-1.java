class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mapa = new HashMap<>();
        int max = 0;
        int j = 0;
        for(int i=0;i<s.length();i++){
            if(mapa.get(s.charAt(i)) == null){
                mapa.put(s.charAt(i), 1);
                if(i-j+1 > max)
                    max = i-j+1;
            }
            else{
                while(s.charAt(i) != s.charAt(j)){
                    mapa.remove(s.charAt(j));
                    j++;
                }
                j++;
            }
        }
        return max;
    }
}
