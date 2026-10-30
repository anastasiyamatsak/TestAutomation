public class StringHelloWorld {
        public static void main(String[] args) {
            String a = "Hello";
            String b = "World";

            Object combinedWords = a + " " + b;
            String result = (String) combinedWords;

            System.out.println(result);
        }
    }

