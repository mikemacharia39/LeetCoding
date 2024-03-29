package javasolutionsforalgorithms.revision_v2.leetcode.math;

/**
 * Finding the first and last digit in a number
 */
public class FirstAndLastDigitInNumber {

    /**
     * This solution uses log10 to find the number of digits in a number.
     * Time complexity: 0(log(n))
     * @param n the number
     * @return the first digit
     */
    public static int firstDigit(long n) {
        int numberOfDigits = (int) Math.log10(n);
        int divisor = (int) Math.pow(10, numberOfDigits);
        return (int) (n / divisor);
    }

    /**
     * This solution uses modulo to find the last digit in a number.
     * Time complexity: 0(1)
     * @param n the number
     * @return the last digit
     */
    public static int lastDigit(long n) {
        return (int) (n % 10);
    }

    /**
     * This is a simple math problem. We can find the first digit by dividing the number by 10 until the number is less than 10.
     * Time complexity: 0(log(n))
     * @param n the number
     * @return the first digit
     */
    public static int firstDigit1(int n) {
        while (n >= 10) {
            n = n / 10;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println("First Digit:  " + firstDigit(1234));
        System.out.println("First Digit1: " + firstDigit1(1234));
        System.out.println("Last Digit:   " + lastDigit(1234));
    }
}
