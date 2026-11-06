public class ClassWork6 {
    // Use an arrow switch to print Weekend for days 6-7, Weekday for 1-5, and Invalid day otherwise.
    static void main(String[] args) {
        int days = 9;

        switch (days) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");

            case 6, 7 -> System.out.println("Weekend");

            default -> System.out.println("Invalid day");
        }
    }
}
