class DemoClass1 {
    int b = 2;
    public void doSomething() {
        //Lambda
        Employee employee = () -> {
            int a=3;
            //System.out.println(this.a); --> This line will throw an error as it is an lambda function and a is an local variable which couldn't be accessed using this keyword
            //As we know that this keyword is used in case of accessing class's properties and not the method or function.
            System.out.println(this.b); // See we could able to access the 'b' here
            return "100";
        };

        //Anonymous class
        Employee employee1 = new Employee() {
            int x = 3;
            @Override
            public String getSalary() {
                System.out.println(this.x); // As it's the Anonymous class property which is itself a class without any name, we could make use of this keyword
                return "100";
            }
        };
    }
}


public class MyClass2 {
    public static void main(String[] args) {
        DemoClass1 myClass = new DemoClass1();
        myClass.doSomething();
    }
}