class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0 ) return false;
        int left = 0;
        int right = matrix.length * matrix[0].length -1;

        

        while(right >= left){
            int mid = (left+right) /2;

            int i = mid / matrix[0].length;
            int j = mid % matrix[0].length;
            
            if(matrix[i][j] > target){
                right = mid-1;
            }
            else if(matrix[i][j]== target){
                return true;
            }
            else{
                left = mid+1;
            }

        }

        return false;
    }
}
