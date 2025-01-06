import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionStudentDemo {
    public static void main(String[] args) {

        Function<String,String> substrFunction = s -> s.substring(0,3);

        Function<List<Student>,List<Student>> studentsListStartsWithVip = li -> {
            List<Student> result = new ArrayList<>();
            for(Student s : li){
                if(substrFunction.apply(s.getName()).equalsIgnoreCase("vip")){
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student(101,"Viphul");
        Student s2 = new Student(102,"Viphal");
        Student s3 = new Student(103,"Vishal");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        /*
        Alternate option:
        List<Student> list = Arrays.asList(s1,s2,s3);
         */

        System.out.println("Student list starting with Vip");
        System.out.println(studentsListStartsWithVip.apply(list));
    }
}

class Student{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}