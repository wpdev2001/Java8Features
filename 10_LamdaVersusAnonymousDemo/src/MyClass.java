public class MyClass{

    public static void main(String[] args) {
        doSomething();
    }

    private static void doSomething(){
        int a = 2;
        Employee employee = () -> {
            //a = 3;
            //The above line will result into following error:
            //Variable used in lambda expression should be final or effectively final
            return "100";
        };

        System.out.println(employee.getSalary());
    }

}