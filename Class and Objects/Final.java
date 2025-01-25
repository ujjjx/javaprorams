public class Final{
    final int x = 10; // Final Variable
    public final void display() {
        System.out.println("Display method in Final class");
    }
}
class Subclass extends Final {
    // Compiler error: Cannot override the final method from Superclass
    // public void display() {
    //     System.out.println("Display method in subclass");
    // }
}
final class FinalClass {
    // Class implementation
}

// Compiler error: Cannot subclass FinalClass
// public class Subclass extends FinalClass {
//     // Class implementation
// }
class MyClass {
    public void printValue(final int value) {
        // value++; // Compiler error: Cannot assign a value to final variable 'value'
        System.out.println("Value: " + value);
    }
}