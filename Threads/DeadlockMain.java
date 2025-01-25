public class DeadlockMain{
    public static void main(String[] args) {
        try{
            System.out.println("Entering into deadlock");
            // Joining the main thread with the current thread
            Thread.currentThread().join(); // In this case, Thread.currentThread().join is calling join() on the current thread,
            // which is the main thread. This is a deadlock situation because the main thread is waiting for itself to die.
            System.out.println("This statement will never execute"); 
        }catch(InterruptedException e){
            // Displaying the stack trace of the exception
            // Displaying the exception along with line number
            e.printStackTrace();
        }
    }
}
