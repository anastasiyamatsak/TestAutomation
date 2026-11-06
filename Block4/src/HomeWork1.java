public class HomeWork1 {
    //Напишете метод, който по номер на ден (1–7) отпечатва името му със switch-case.
    // За всяко друго число отпечатайте "Invalid day".
    static void main(String[] args) {
        int dayNum = 5;

        switch (dayNum) {
            case 1 :
                System.out.println ("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println ("Invalid Day");
        }
    }
}



