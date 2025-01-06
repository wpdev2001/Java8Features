import org.w3c.dom.ls.LSOutput;

import java.util.function.Predicate;

public class PredicateStudentDemo {
    public static void main(String[] args) {
        Student s = new Student(10,"AAA");
        Predicate<Student> studentPredicate = x -> x.getId() > 100;
        System.out.println(studentPredicate.test(s));
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