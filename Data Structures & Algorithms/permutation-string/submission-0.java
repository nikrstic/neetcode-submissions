class Solution {

    public boolean isMatch(int[] array){
        for(int a: array){
            if(a != 0)
                return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] charFreq = new int[26];
        for (Character ch : s1.toCharArray()) {
            charFreq[ch - 'a'] += 1;
        }
        int left = 0;
        int charPos, tmp;
        int sum = 0;
        for(int i=0;i<s1.length();i++){
            charPos = s2.charAt(i) - 'a';
           
            charFreq[charPos]--;
                
        }
        if (isMatch(charFreq)) return true;
        for (int i = s1.length(); i < s2.length(); i++) {
            charPos = s2.charAt(i) - 'a';
            
            charFreq[charPos]--;
            
            charFreq[s2.charAt(left) - 'a']++;
            left++;
            if(isMatch(charFreq))
                return true;
        }
        return isMatch(charFreq);
    }
}
