public class HomeWork3 {
    // Намерете сумата на числата в [1, 100], които се делят на 3 или на 5.
    // Използвайте continue, за да прескочите останалите. Очакван резултат: 2418.
    static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                continue;
            }
            sum += i;
        }

        System.out.println(sum);
    }
}