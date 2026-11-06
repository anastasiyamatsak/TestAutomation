public class ClassWork1 {
    // Write an IF statement that examines two integer variables and exchanges their values if the
    // first one is greater than the second one.
    public
    static void main(String[] args) {
        int a = 10;
        int b = 5;
        if (a > b) {

            int buff = 0;
            buff = a;
            a = b;
            b = buff;

        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
