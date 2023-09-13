public class Main {
    public static void main(String[] args) {
        // Iterate through numbers from 100 to 999 (3-digit numbers)
        for (int number = 100; number <= 999; number++) {
            int originalNumber, remainder, result = 0;
            originalNumber = number;

            // Calculate the sum of cubes of individual digits
            while (originalNumber != 0) {
                remainder = originalNumber % 10; // Extract the rightmost digit
                result += Math.pow(remainder, 3); // Cube the digit and add to the result
                originalNumber /= 10; // Remove the rightmost digit
            }

            // Check if the result is equal to the original number
            if (result == number) {
                System.out.println(number + " is an Armstrong number.");
            }
        }
    }
}
