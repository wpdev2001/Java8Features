public class MyClass{

    public static void main(String[] args) {

        //This it the example of anonymous inner class
        Employee emp = new Employee() {
            @Override
            public String getSalary() {
                return "100000";
            }

            @Override
            public String getDesignation() {
                return "Developer";
            }
        };

        /*
        Questions:
        1. Without extending the animal interface how does the anonymous class able to override the Employee interface methods??
        2. How is it possible here to create the object of interface using new for declaring the anonymous inner class ?? "Employee emp = new Employee();"
         */

    }

}