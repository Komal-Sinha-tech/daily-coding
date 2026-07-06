package twoD_Array;

public class staircase_left {
    public static boolean staircaseSearch_leftMost(int matrix[][],int key){
        int row=matrix.length-1;
        int col=0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col]== key){
                System.out.println("found key at ("+row+","+col+") matrix ");
                return true;
            }else if(key<matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        int key=15;
        staircaseSearch_leftMost(matrix, key);
        
    }
}
