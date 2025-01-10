import java.util.Arrays;
import java.util.List;

public class WithMethodReferenceDemo2 {
    public void hello(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("EEE","FFF","GGG");
        //students.forEach(WithMethodReferenceDemo2::hello); --> ERROR: Non-static can't access static data
        WithMethodReferenceDemo2 obj = new WithMethodReferenceDemo2();
        students.forEach(obj::hello);
    }
}
