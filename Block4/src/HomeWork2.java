public class HomeWork2 {
    //Отпечатайте числата от 1 до 30. Вместо числата, които се делят на 3, отпечатайте "Fizz",
    // на 5 – "Buzz", а на 3 и на 5 – "FizzBuzz".
    static void main(String[] args) {

            for (int i = 1; i <= 30; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }



