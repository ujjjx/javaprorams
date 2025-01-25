public class Constructors {

    public class ClassName{
        // Constructor declaration
        public ClassName(int parameters){
            // Constructor body
        }
    }
    public static class Person{
        private String name;
        private int age;
        public Person(String n,int age){ // Parameterized Constructor
            name = n;
            age = age;
        }
        public Person(){ // Constructor Overloading
            name = "Unknown";
            age = 0;
        }
    }
}