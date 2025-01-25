public class ChainingConstructors {}
// Same Class Constructor Chaining
class MyClass{
    private int value;
    // Constructor with one parameter
    public MyClass(int value){
        this.value = value;
        System.out.println("Value is"+value);
    }
    // Constructor with no parameter, chaining to the constructors above
    public MyClass(){
        this(0); // Calls the constructor with value 0
    }
    public static void main(String[] args) {
        System.out.println("Constructor of no parameter is chaining parametric constructor");
        MyClass myclass = new MyClass();
        System.out.println("Parametric Constructor");
        MyClass myclass2 = new MyClass(10);
    }
}
// SubClass Constructor Chaining
class Animal{
    private String species;
    public Animal(String species){
        this.species = species;
        System.out.println("Animal Constructor Called");
    }
    // Method in Super Class
    public void displaySpecies(){
        System.out.println("Species: "+species);
    }
}
class Dog extends Animal{
    private String name;
    public Dog(String species,String name){
        super(species); // Calling superclass constructor
        this.name = name;
        System.out.println("Dog Constructor called");
    }
    public void displayName() {
        System.out.println("Name: " + name);
    }
}
class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Canine", "Buddy");
        dog.displaySpecies(); // Output: Species: Canine
        dog.displayName();   // Output: Name: Buddy
    }
}

