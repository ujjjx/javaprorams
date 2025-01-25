public class isAlive {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("Thread Started");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread Completed");
        });
        System.out.println("Before starting thread: "+thread.isAlive());
        thread.start();
        System.out.println("After Starting the thread: "+thread.isAlive());
        try {
            thread.join(); // Wait for the thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After thread completion: " + thread.isAlive());
    }
}
