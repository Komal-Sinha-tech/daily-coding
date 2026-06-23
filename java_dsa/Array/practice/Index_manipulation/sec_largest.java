package practice.Index_manipulation;

public class sec_largest {
    public static void sec_largest(int numbers[]){
        int largest=numbers[0];
        int sec_largest =Integer.MIN_VALUE;
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>largest){
                sec_largest=largest;
                largest=numbers[i];
            }else if(numbers[i]<largest && numbers[i]>sec_largest){
                sec_largest=numbers[i];
                        }
        }
        System.out.print(sec_largest);
        }
    public static void main(String[] args) {
        int numbers[]= {1,2,4,6,7,7,9};
        sec_largest(numbers);
    }
}
