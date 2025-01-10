import java.util.Arrays;
import java.util.List;

public class WithMethodReferenceDemo1 {

    static void hello(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("AAA","BBB","CCC");
        //Method Reference demo
        students.forEach(WithMethodReferenceDemo1::hello);
    }
}
