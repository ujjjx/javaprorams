// Define a superclass
class Animal {
    Animal(){
        System.out.println("Animal constructor");
    }
    void eat() {
        System.out.println("Animal is eating");
    }
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
// Define a subclass derived from Animal
class Dog extends Animal {
    Dog(){
        super(); // Calls the superclass constructor implicitly
        System.out.println("Dog Constructor");
    }
    void bark() {
        System.out.println("Dog is barking");
    }
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
// Define another subclass derived from Dog
class Labrador extends Dog {
    Labrador(){
        super(); // Calls superclass constructor implicitly
        System.out.println("Labrador Constructor");
    }
    void color() {
        System.out.println("Labrador is brown in color");
    }
}
class MultiLevelHierarchy {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();   // Inherited from Animal
        labrador.bark();  // Inherited from Dog
        labrador.color(); // Defined in Labrador
    }
}
class MethodOverrideDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.makeSound();    // Output: Dog barks
    }
}
