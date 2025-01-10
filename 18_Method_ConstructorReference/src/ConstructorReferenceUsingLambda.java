import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//For this particular code we need to create Student class
public class ConstructorReferenceUsingLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("XXX","YYY","ZZZ");
        List<Student> studentsList = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
        //printing Students objects
        studentsList.forEach(x -> System.out.println(x));
    }
}

class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
}