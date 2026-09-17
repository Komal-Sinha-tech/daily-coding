package recursion;

public class friend {
    public static int friendPair(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendPair(n-1);
        //Pair
        int fnm2 = friendPair(n-2);
        int pairways = (n-1)* fnm2;

        int totWays = fnm1+pairways;
        return totWays;
        // return friendPair(n-1)+(n-1)* friendPair(n-2);
    }
    public static void main(String [] args){
    System.out.println(friendPair(3));
    }
}