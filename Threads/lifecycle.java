class thread implements Runnable {
    public void run() {
        // moving to thread2 to timed waiting state
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread 1 while it called join() method on thread 2 -" + 
        lifecycle.thread1.getState()); // Here, we have used the getState() method to get the state of the thread.
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class lifecycle implements Runnable{
    public static Thread thread1; // can be accessed without using an object of the class
    // Here, we have created a thread object of Thread class and named it thread1. 
    public static lifecycle obj;
    public static void main(String[] args) {
        obj = new lifecycle();
        thread1 = new Thread(obj);
        // thread1 created and is currently in the NEW state.
        System.out.println("State of thread 1 after creating it -"+ thread1.getState());
        thread1.start(); // thread1 moved to Runnable state
        System.out.println("State of thread 1 after calling .start() method on it - "+thread1.getState());
    }
    public void run(){
        thread myThread = new thread();
        Thread thread2 = new Thread(myThread);
        // thread1 created and is currently in the NEW state.
        System.out.println("State of thread 2 after creating it - "+ thread2.getState());
        thread2.start(); // thread2 moved to Runnable state
        System.out.println("State of thread 2 after calling .start() method on it - " + thread2.getState());
        // moving thread1 to timed waiting state
        try {
            // moving thread1 to timed waiting state
            Thread.sleep(200); // Thread represents current thread executing this code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread 2 after calling .sleep() method on thread1 - " + thread2.getState());
        try{
            thread2.join(); // waiting for thread2 to die
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of thread 2 when it has finished it's execution - " + thread2.getState());
    }
}