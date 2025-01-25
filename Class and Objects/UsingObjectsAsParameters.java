public class UsingObjectsAsParameters {
    private String name;
    private int age;

    // Constructor
    public UsingObjectsAsParameters(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Main {
    // Method that takes a Person object as a parameter
    public static void printPersonDetails(UsingObjectsAsParameters person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

    public static void main(String[] args) {
        // Create a Person object
        UsingObjectsAsParameters person1 = new UsingObjectsAsParameters("John", 30);

        // Pass the Person object as a parameter to the method
        printPersonDetails(person1);
    }
}
