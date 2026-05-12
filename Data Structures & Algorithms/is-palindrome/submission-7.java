class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        int rightSide = charArray.length-1;
        int leftSide = 0;
        while(rightSide>leftSide){
            while(rightSide>leftSide && !Character.isLetterOrDigit(charArray[leftSide])){
                leftSide++;
            }
            while(rightSide>leftSide && !Character.isLetterOrDigit(charArray[rightSide]))
                rightSide--;

            if(charArray[leftSide]!= charArray[rightSide]){
                return false;
            }
            leftSide++;
            rightSide--;
        }
        return true;
    }
}
