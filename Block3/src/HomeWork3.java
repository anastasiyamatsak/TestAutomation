public class HomeWork3 {
    public static void main(String[] args) {
        int year = 2026;

        boolean Visokosna = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        System.out.println(year + " е високосна: " + Visokosna);
    }
}

