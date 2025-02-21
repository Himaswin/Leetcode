public class SuperDigit {
    // Recursive function to compute the super digit
    public static int superDigit(String n) {
        if (n.length() == 1) {
            return Integer.parseInt(n); // Base case: return if single-digit
        }
        
        long sum = 0;
        for (char c : n.toCharArray()) {
            sum += Character.getNumericValue(c); // Summing digits
        }
        
        return superDigit(String.valueOf(sum)); // Recursive call
    }

    // Function to handle case when p = n repeated k times
    public static int superDigit(String n, int k) {
        long sumOfDigits = 0;
        
        // Compute the sum of digits in n
        for (char c : n.toCharArray()) {
            sumOfDigits += Character.getNumericValue(c);
        }
        
        // Multiply by k since concatenation is just repetition
        long initialSum = sumOfDigits * k;
        
        return superDigit(String.valueOf(initialSum)); // Find the super digit of the new sum
    }

    public static void main(String[] args) {
        // Case 1: Super digit of a single number
        System.out.println("Super Digit of 9875: " + superDigit("9875")); // Output: 2

        // Case 2: Super digit when a number is repeated k times
        System.out.println("Super Digit of 9875 repeated 4 times: " + superDigit("9875", 4)); // Output: 8
        
        // Additional Test Cases
        System.out.println("Super Digit of 123: " + superDigit("123")); // Output: 6
        System.out.println("Super Digit of 123 repeated 3 times: " + superDigit("123", 3)); // Output: 9
    }
}
