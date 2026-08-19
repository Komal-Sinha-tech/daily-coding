package recursion;

public class tiling {
    public static int tiling_Problem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int fn_1=tiling_Problem(n-1);
        //horizontal
        int fn_2=tiling_Problem(n-2);
        int totWays = fn_1+fn_2;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tiling_Problem(3));
    }
}
