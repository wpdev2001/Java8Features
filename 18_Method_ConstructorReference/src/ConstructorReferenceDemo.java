import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("PPP","QQQ","RRR");
        //List<Student> studentsList = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
        List<Student1> students = names.stream().map(Student1::new).collect(Collectors.toList());
        students.forEach(s -> System.out.println(s));

    }
}

class Student1{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                '}';
    }
}