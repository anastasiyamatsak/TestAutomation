public class Classwork2 {
    // Write a program that shows the sign of the product of three real numbers without calculating it.
    // If any of the numbers is 0, print 0. Use a sequence of if statements.
    static void main(String[] args) {

        double a = 0;
        double b = -25.0;
        double c = 20.0;

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("0 detected");
        } else {
            double sum = a + b + c;
            if (sum > 0) {
                System.out.println("Positive");
            } else if (sum < 0) {
                System.out.println("Negative");
            } else {
                    System.out.println("Zero Sum");
                }

            }
        }

    }