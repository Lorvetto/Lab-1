/**
 * Prints how many multiples of 3 or 5 there are below 1000.
 */
public class Multiples {

    public static void main(String[] args) {
        // Accumulator which holds the number of multiples of 3 or 5 below 1000
        int counter = 0;

        for (int i = 1; i < 1000; i++) {
            boolean multipleOfThree = i % 3 == 0;
            boolean multipleOfFive = i % 5 == 0;

            if (multipleOfThree || multipleOfFive) {
                counter += 1;
            }

        }
        System.out.println("The number of multiples of 3 and 5 below 1000 are " + counter);
    }
}
