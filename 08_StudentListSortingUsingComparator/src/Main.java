import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> slist = new ArrayList<>();

        slist.add(new Student(101,"AAA",89.0));
        slist.add(new Student(104,"DDD",79.0));
        slist.add(new Student(103,"CCC",99.0));
        slist.add(new Student(102,"BBB",69.0));

        System.out.println("Student list before sorting : " + slist);

        Collections.sort(slist,(a,b) -> b.getRno() - a.getRno());

        System.out.println("Student list after sorting in descending : " + slist);

    }
}