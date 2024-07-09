package StaticKeyword;

public class Lecture7 {
    public static void main(String[] args) {
        System.out.println(Employee.company);

        Employee.count = 20;

        Employee.myFirstMethod();
    }

}

class Employee {
    public String name;

    public static final String company = "Internshala";// Constant value.It belongs to class not to the object.

    public static int count = 0;

    public static void myFirstMethod() {
        System.out.println("my first method");
        System.out.println(count);
        // System.out.println(name); cant be used.
    }
}

// It bleongs to class not to the object.
// We can access only the static method to the static method.
// We can only use static variable in the static method.
