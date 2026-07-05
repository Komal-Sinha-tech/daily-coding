package twoD_Array;
public class sprial {
    public static void spiral_matrix(int matrix[][]){
        int startRow =0;
        int startCol=0;
        int EndRow =matrix.length-1;
        int EndCol=matrix[0].length-1;
        while(startRow<=EndRow && startCol<=EndCol){
            //top
            for(int j=startCol;j<=EndCol;j++){
            System.out.print(matrix[startRow][j]+" ");
            }
            //left
            for(int i=startRow+1;i<=EndRow;i++){
                System.out.print(matrix[EndCol][i]+" ");
            }
            //bottom
            for(int j=EndCol-1;j>=startCol;j--){
                System.out.print(matrix[EndRow][j]+ " ");
            }
            //right
            for(int i=EndRow-1;i>=startRow+1;i--){
             System.out.print(matrix[startCol][i]+" ");
            }
            startCol++;
            startRow++;
            EndCol--;
            EndRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        spiral_matrix(matrix);
    }
}
