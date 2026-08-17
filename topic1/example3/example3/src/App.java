import java.util.Scanner;

import com.processor.ValidateText;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        ValidateText validateText = new ValidateText(text);
        validateText.validText();
        scanner.close();
    }
}
