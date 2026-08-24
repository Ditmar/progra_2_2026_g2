import java.util.Scanner;

import com.enterprise.Employed;
import com.enterprise.HandlerEmployed;

import utils.PrintProcess;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HandlerEmployed handler = new HandlerEmployed();
        PrintProcess.welcome();
        Integer option = -1;
        do {

            PrintProcess.printOptions();

            String optionLine = scanner.nextLine();
            option = Integer.parseInt(optionLine);
            switch (option) {
                case 1: {
                    PrintProcess.register();
                    String name = scanner.nextLine();
                    String lastname = scanner.nextLine();
                    String ci = scanner.nextLine();
                    String age = scanner.nextLine();
                    Employed employed = new Employed(name, lastname, ci, Integer.parseInt(age));
                    handler.addEmployed(employed);
                    break;
                }
                case 2: {
                    PrintProcess.remove();
                    String ci = scanner.nextLine();
                    handler.removeEmployed(ci);
                    break;
                }
                case 3: {
                    PrintProcess.list();
                    handler.listEmployed();
                    break;
                }
                case 4: {
                    PrintProcess.search();
                    String ci = scanner.nextLine();
                    Employed employed = handler.findEmployed(ci);
                    if (employed == null) {
                        PrintProcess.notFound();
                        return;
                    }
                    employed.info();
                    break;
                }
                default:
                    break;
            }
        } while (option != 5);
        scanner.close();
    }
}
