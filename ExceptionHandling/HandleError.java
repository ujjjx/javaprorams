import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0,b = 0,c = 0;
        Random r = new Random();
        // Loop to perform division operations
        for(int i=0; i<32000; i++) {
            try {
                // Generate two random integers
                b = r.nextInt();
                c = r.nextInt();

                // Perform division operation and store result in 'a'
                a = 12345 / (b/c);
            } catch (ArithmeticException e) {
                // Handle divide-by-zero error
                System.out.println("Division by zero.");
                a = 0; // Set 'a' to zero and continue
            }

            // Print the value of 'a'
            System.out.println("a: " + a);
        }
    }
}
