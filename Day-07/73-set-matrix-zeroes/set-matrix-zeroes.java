class Solution {
    public void markRow(int[][] matrix , int row){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[row][j]!=0){
                matrix[row][j]=99999;
            }
        }
    }
    public void markColoumn(int[][] matrix , int coloumn){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][coloumn]!=0){
                matrix[i][coloumn]=99999;
            }
        }
    }
    
    public void setZeroes(int[][] matrix) {
        
     for(int i=0 ; i<matrix.length ;i++){
        for(int j=0 ; j<matrix[0].length ;j++){
           if(matrix[i][j]==0){
            markRow(matrix,i);
            markColoumn(matrix,j);
           }
        }
     }
     for(int i=0 ; i<matrix.length ;i++){
        for(int j=0 ; j<matrix[0].length ;j++){
           if(matrix[i][j] == 99999){
            matrix[i][j]=0;
           }
        }
     }       
   }
}