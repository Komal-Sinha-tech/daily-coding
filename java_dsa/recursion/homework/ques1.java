package recursion.homework;

// For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.
public class ques1 {
    public static void AllOccurence (int arr[],int key,int i){
        if(i== arr.length){
            return ;
        }
        if(key == arr[i]){
            System.out.print(i+" ");
        }
        AllOccurence(arr, key, i+1);
    }

    public static void main(String [] args){
    int arr []={3,2,4,5,6,2,7,2,2};
    int key=2;
    AllOccurence(arr, key, 0);
    System.out.println();
    }
}
