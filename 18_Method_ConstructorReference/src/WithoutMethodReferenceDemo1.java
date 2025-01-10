import java.util.Arrays;
import java.util.List;

public class WithoutMethodReferenceDemo1 {

//    public static void print(String s){
//        System.out.println(s);
//    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("AAA","BBB","CCC");
        students.forEach(x -> System.out.println(x));
    }
}