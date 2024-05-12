public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double total = 0;
        double maximum = Double.MIN_VALUE;
        double minimum = Double.MAX_VALUE;

        while (count < 5) {
            System.out.print("Enter a floating-point value: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                total += value;
                maximum = Math.max(maximum, value);
                minimum = Math.min(minimum, value);
                count++;
            } else {
                System.out.println("Invalid input. Please enter a floating-point value.");
                scanner.next(); // consume invalid input
            }
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}