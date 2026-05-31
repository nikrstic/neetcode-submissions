class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> mapa = new HashMap<>();
        int left = 0;
        int max_freq = 0;
        int max = 0;
        for(int i=0; i<s.length();i++){
             
            int a = mapa.compute(s.charAt(i), (key,v)-> v == null ? 1: v+1);
            
            if(a > max_freq){
                max_freq = a;
            }

            if(i-left+1-max_freq > k){
                // if(mapa.get(s.charAt(left)) == max_freq){
                //     max_freq--;
                // }
                mapa.compute(s.charAt(left), (key, v)-> v-1);
                left++;
            }
            else{
                if(max < i-left+1-max_freq){
                    max = i-left+1-max_freq;
                }
            }

            

        }
        return s.length()-left;
    }
}
