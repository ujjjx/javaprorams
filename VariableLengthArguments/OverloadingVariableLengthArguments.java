public class OverloadingVariableLengthArguments {
    // Method to find the maximum of integers
    public static int max(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to find the maximum of doubles
    public static double max(double... numbers) {
        double max = Double.NEGATIVE_INFINITY;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int maxInt = max(10, 20, 30, 40);  // Calls the first max method
        double maxDouble = max(10.5, 20.5, 30.5); // Calls the second max method

        System.out.println("Maximum integer: " + maxInt); // Output: Maximum integer: 40
        System.out.println("Maximum double: " + maxDouble); // Output: Maximum double: 30.5
    }
}