// Define an interface
public interface Animal {
    void makeSound();
}
// Define another interface
interface Edible{
    void eat();
}
// Implement the Animal interface
class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
}
// Implement both Animal and Edible interfaces
class Cat implements Animal,Edible{
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
    @Override
    public void eat() {
        System.out.println("Eating fish");
    }
}
class InterfaceExample {
    public static void main(String[] args) {
        // Create objects of classes implementing the interfaces
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call methods defined in the interfaces
        dog.makeSound(); // Output: Woof!
        cat.makeSound(); // Output: Meow!
        cat.eat();       // Output: Eating fish
    }
}
