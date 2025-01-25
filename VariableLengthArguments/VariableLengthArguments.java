
public class VariableLengthArguments {
    // Method with variable-length arguments
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        // Call the sum method with different number of arguments
        int sum1 = sum(1, 2, 3);        // Passing three arguments
        int sum2 = sum(10, 20);         // Passing two arguments
        int sum3 = sum(5, 10, 15, 20);  // Passing four arguments

        System.out.println("Sum 1: " + sum1);  // Output: Sum 1: 6
        System.out.println("Sum 2: " + sum2);  // Output: Sum 2: 30
        System.out.println("Sum 3: " + sum3);  // Output: Sum 3: 50
    }
}


