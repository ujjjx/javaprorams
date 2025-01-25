public class MyCustomException extends Exception{
    // Constructor with a message
    public MyCustomException(String message) {
        // Call the constructor of the superclass (Exception) with the provided message
        super(message);
    }
}
// Example class that uses the custom exception
class CustomExceptionExample {
    // Method that may throw the custom exception
    static void myMethod(int value) throws MyCustomException {
        if (value < 0) {
            // If the condition is met, throw the custom exception
            throw new MyCustomException("Value cannot be negative");
        } else {
            // Otherwise, perform some operation
            System.out.println("Value is: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            // Call the method that may throw the custom exception
            myMethod(-5);
        } catch (MyCustomException e) {
            // Catch and handle the custom exception
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}