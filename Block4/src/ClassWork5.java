public class ClassWork5 {
    // Convert a score 0-100 to a grade (90+ A, 80+ B, 70+ C, 60+ D, else F) with else-if.
    // Print Invalid score outside the range
    static void main(String[] args) {
        int score = -5;
        if (score >= 60 && score < 70) {
                System.out.println ("D");
            } else if (score >= 70 && score < 80) {
                System.out.println ("C");
            } else if (score >= 80 && score < 90) {
                System.out.println ("B");
            } else if (score >= 90 && score <= 100) {
                System.out.println ("A");
            } else {
            System.out.println("Invalid score");
        }
    }
}
