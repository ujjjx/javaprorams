public class NewThread implements Runnable {
    Thread t;
    NewThread(){
        // Create a new thread
        // Passing this as the first argument indicates that you want
        // the new thread to call the run() method on this object.
        t = new Thread(this,"Demo thread"); // creates a new Thread object
        System.out.println("Child Thread: "+t);

        t.start(); // Start  the thread of execution beginning the run() method.

        // After calling the start(), NewThread's constructor returns to main().
    }
    // This is the entry point of second thread
    @Override
    public void run() {
        try{
            for(int i = 5;i>0;i--){
                System.out.println("Child Thread: "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        new NewThread();
        try{
            // Both threads continue running, sharing the CPU until their loop finishes
            for(int i = 5;i>0;i--){
                System.out.println("Main Thread:   "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
