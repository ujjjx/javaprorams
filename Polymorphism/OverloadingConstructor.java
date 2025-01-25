public class OverloadingConstructor {
    private String name;
    private int age;

    // Default constructor
    public OverloadingConstructor() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with name parameter
    public OverloadingConstructor(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    // Constructor with name and age parameters
    public OverloadingConstructor(String name, int age) {
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
    public static void main(String[] args) {
        // Create Person objects using different constructors
        OverloadingConstructor person1 = new OverloadingConstructor(); // Default constructor
        OverloadingConstructor person2 = new OverloadingConstructor("John"); // Constructor with name parameter
        OverloadingConstructor person3 = new OverloadingConstructor("Jane", 25); // Constructor with name and age parameters

        // Display information about the persons
        System.out.println("Person 1: Name - " + person1.getName() + ", Age - " + person1.getAge());
        System.out.println("Person 2: Name - " + person2.getName() + ", Age - " + person2.getAge());
        System.out.println("Person 3: Name - " + person3.getName() + ", Age - " + person3.getAge());
    }
}



