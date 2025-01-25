public class printStackTrace {
    public static void main(String[] args) {
        try{
            firstMethod();
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
            e.printStackTrace();
        }
    }
    public static void firstMethod() {
        secondMethod();
    }
    public static void secondMethod() {
        int a = 5;
        int b = 0;
        int c = a/b;
    }
}
// In Java, a Throwable is the superclass of all errors and exceptions in the Java language. 
// The printStackTrace() method is a tool used to handle exceptions and errors. 
// It prints a stack trace for this Throwable object on the error output stream that 
// is the value of the field System.err.

// A stack trace is a report that provides information about the program execution at a 
// certain point, usually when an exception is thrown. It shows the order of the method calls 
// that led up to the exception being thrown, which can be very helpful for debugging.
