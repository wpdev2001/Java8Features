class DemoClass {
    int a = 3; // if i am writing this line here then its working
    public void doSomething() {
//      int a = 3; --> But when i am writing this line here it isn't working and showing the error related to final
        Employee employee = () -> {
            a=2;
            System.out.println(a); // OUTPUT: 2
            return "100";
        };
        System.out.println(employee.getSalary());
    }
}

// Class with a main method
public class MyClass1 {
    public static void main(String[] args) {
        DemoClass myClass = new DemoClass();
        myClass.doSomething();
    }
}