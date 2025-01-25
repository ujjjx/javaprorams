public class ThrowExample {
    public static void main(String[] args) {
        try{
            int age = -5;
            if(age<0)
                throw new IllegalArgumentException("Age cannot be negative");
            System.out.println("Age is: " + age);
        }catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
class ThrowDemo {
    // throws Exception indicates that the function throwOne()
    // may throw an IllegalAccessException.
    // That means that if any code inside the method throws an
    // IllegalAccessException, the method will not handle it internally,
    // but instead it will propogate that exception to the caller.
    // and the caller must handle it or propogate it further.
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwsOne. ");
        throw new IllegalAccessException("demo");
    }
    // function catching exception inside itself
    static void demoproc() {
        try {
            // Throw a NullPointerException with a message "demo"
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            // Rethrow the caught exception
            throw e; // rethrow the exception
        }
    }
    public static void main(String args[]) {
       try {
           // Call demoproc() method which may throw NullPointerException
           demoproc();
       } catch(NullPointerException e) {
           // Catch the rethrown NullPointerException
           System.out.println("Recaught: " + e);
       }
        // try{
        //     throwOne();
        // }catch (IllegalAccessException e){
        //     System.out.println("Caught"+e);
        // }
    }
}