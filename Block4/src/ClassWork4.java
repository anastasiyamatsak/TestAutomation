public class ClassWork4 {
    // Given three integers, print the largest using nested if statements (no Math.max).
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
    if (a > b && a > c)  {
        System.out.println("The largest number" + a);
    } else if (b > a && b > c) {
     System.out.println("The largest number" + b);
    } else if (c > a && c > b) {
        System.out.println("The largest number " + c);
        } else System.out.println("a = 0 b = 0 c = 0");
    }
}
