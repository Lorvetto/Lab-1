/**
 * Prints how many steps it takes to reach 0 if you start at 100.
 * if n is even divide by 2 if its odd subtract 1
 */
public class Reduce {

    public static void main(String[] args) {
        // Accumulator to count the number of steps
        int counter = 0;

        int n = 100;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
                counter += 1;
            }

            else {
                n -= 1;
                counter += 1;
            }
        }

        System.out.println("The number of steps it takes to reach 0 form 100 is " + counter);

    }
}
