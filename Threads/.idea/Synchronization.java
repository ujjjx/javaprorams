public class Synchronization {
    static class SharedResource {
        // Creating synchronized function
        synchronized void waitForSignal() {
            System.out.println(Thread.currentThread().getId() + " is running for a signal...");
            try {
                wait(); // Placed within a synchronized block
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        synchronized void sendSignal() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Sending signal to wake up the waiting thread");
            notify(); // Placed within a synchronized block
        }
    }
    s
    static class WaitingThread implements Runnable {
        private  SharedResource sharedResource;

        WaitingThread(SharedResource sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            sharedResource.waitForSignal();
        }
    }

    static class SignalingThread implements Runnable {
        private  SharedResource sharedResource;

        SignalingThread(SharedResource sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            sharedResource.sendSignal();
        }
    }

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        // Create and start the waiting thread
        Thread waitingThread = new Thread(new WaitingThread(sharedResource));
        waitingThread.start();
        Thread signalingThread = new Thread(new SignalingThread(sharedResource));
        signalingThread.start();
    }

}
