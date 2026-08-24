import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer quantity = scanner.nextInt();
        for (Integer i = 0; i < quantity; i++) {
            String input = scanner.nextLine();
            if (validPalindrome(input)) {
                System.out.println("Palindromo: " + input);
            } else {
                System.out.println("No Palindromo: " + input);
            }
        }

        scanner.close();

    }

    public static Boolean validPalindrome(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        String reverse = stringBuilder.reverse().toString();
        return input.equals(reverse);
    }
}
