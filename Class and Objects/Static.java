public class Static {
    // Static variable
    private static int staticVariable = 10;
    private  int outerInstanceVar = 20;
    // Static Method
    public static void staticMethod(){
        System.out.println("Inside staticMethod()");
    }
    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Inside nonStaticMethod()");
    }
    // Static Class
    public static class StaticNested{
        private int nestedVar = 30;
        public void display() {
            // Accessing outer class static variable
            System.out.println("Outer static variable: " + staticVariable);

            // Cannot access outer class instance variable directly from static context
            // System.out.println("Outer instance variable: " + outerInstanceVar);

            // Accessing nested class variable
            System.out.println("Nested variable: " + nestedVar);
        }
    }


    public static void main(String[] args) {
        // Accessing static variable and method without creating an object
        System.out.println("Static variable: " + Static.staticVariable);
        Static.staticMethod();
        // Creating an object of MyClass
        Static obj = new Static();

        // Accessing static variable and method using object
        System.out.println("Static variable via object: " + obj.staticVariable);
        obj.staticMethod();
        // Accessing non-static method using object
        obj.nonStaticMethod();
        // Creating an instance of the static nested class
        Static.StaticNested nestedObj = new Static.StaticNested();

        // Calling the method of the static nested class
        nestedObj.display();
    }
}
