import java.util.Arrays;

public class SumOfEvenUsingStream {
    public static void main(String[] args) {

        //Imperative approach
        int[] a = {11,45,31,23,12,56,6};
        int sum = 0;

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                sum = sum + a[i];
            }
        }
        System.out.println("Sum of Even numbers without using stream: " + sum);

        //Declarative Approach using Stream APIs
        int sum1 = Arrays.stream(a).filter(x -> x % 2 == 0).sum();
        System.out.println("Sum of Even numbers using Stream: " + sum1);
    }
}