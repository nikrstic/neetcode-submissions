class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> array = new ArrayList<HashSet<Character>>();
        for(int i=0;i<27;i++){
            array.add(new HashSet<Character>());
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] != '.'){
                    // add gives false if element exists
                    if(!array.get(j).add(board[i][j])){
                        return false;
                    }
                    if(!array.get(9*1+i).add(board[i][j])){
                        return false;
                    }
                    if(!array.get(9*2+(i/3)*3 +j/3).add(board[i][j])){
                        return false;
                    }
                }
            }   
        }
        return true;
    }
}
