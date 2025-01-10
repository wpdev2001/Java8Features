import java.util.Arrays;
import java.util.List;

public class WithoutMethodReferenceDemo2 {

    static void hello(String s){
        System.out.println("Hello " + s);
    }
    public static void main(String[] args) {

        List<String> students = Arrays.asList("AAA","BBB","CCC");
        students.forEach(x->hello(x));

    }
}
