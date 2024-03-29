package javasolutionsforalgorithms.revision_v2.hackerrank.math;

/**
 * <a href="https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem">...</a>
 *
 * Sherlock Holmes suspects his archenemy Professor Moriarty is once again plotting something diabolical.
 * Sherlock's companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their supercomputer,
 * The Beast.
 *
 * Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting
 * The Beast with a virus. He also gives him a clue: an integer.
 * Sherlock determines the key to removing the virus is to find the largest Decent Number having that number of digits.
 *
 * A Decent Number has the following properties:
 *
 * Its digits can only be 3's and/or 5's.
 * The number of 3's it contains is divisible by 5.
 * The number of 5's it contains is divisible by 3.
 * It is the largest such number for its length.
 * Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast.
 * Your task is to help Sherlock find the key before The Beast is destroyed!
 */
public class SherlockAndTheBeast {
    public static void decentNumber(int n) {
        int x = -1;

        for (int i = n; i >= 0; i--) {
            if (i % 3 == 0 && (n - i) % 5 == 0) {
                x = i;
                break;
            }
        }

        if (x == -1) {
            System.out.println("-1");
        } else {
            System.out.println("5".repeat(x) + "3".repeat(n-x));
        }
    }
}
