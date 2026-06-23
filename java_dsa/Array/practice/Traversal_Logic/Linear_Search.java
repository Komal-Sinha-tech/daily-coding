package practice.Traversal_Logic;

public class Linear_Search {
    public static int Linear_Search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if( key == numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int numbers [] = {2,4,6,8,24,25,26};
         int key = 8;
         int Linear_Search = Linear_Search(numbers,key);
        if(Linear_Search == -1){
            System.out.println("the key element not found");
        }else{
            System.out.println("the key element found at index : "+Linear_Search);
        }
    }
}
