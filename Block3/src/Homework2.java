public class Homework2 {
    public static void main(String[] args) {
        int number = 472;

        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 10;

        int sum = hundreds + tens + ones;

        System.out.println(sum);
    }
}

