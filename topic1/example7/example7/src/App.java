import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws Exception {
        FileOutputStream outputStream = new FileOutputStream("/Users/ditmar/progra2/topic1/example7/example7/file/output.txt");
        PrintStream printStream = new PrintStream(outputStream);
        printStream.println("Hola, mando datos al archivo ");
        printStream.println("six seven  ");
        printStream.println("farmeando aura ");
        // buffer Reader
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String keyBoardData = bufferedReader.readLine();
        printStream.println(keyBoardData);
        

    }
}
