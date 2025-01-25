
public class OverloadingMethods {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        OverloadingMethods mathUtils = new OverloadingMethods();

        // Call the add method with two integers
        int sum1 = mathUtils.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum1);

        // Call the add method with three integers
        int sum2 = mathUtils.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15: " + sum2);

        // Call the add method with two doubles
        double sum3 = mathUtils.add(5.5, 10.5);
        System.out.println("Sum of 5.5 and 10.5: " + sum3);
    }
}
