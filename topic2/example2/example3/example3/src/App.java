import utils.MyReader;

public class App {
    public static void main(String[] args) throws Exception {
        MyReader reader = new MyReader();
        System.out.println("Write a number");
        Integer data = reader.readInt();
        System.out.println("The Number is:  " + data);

    }
}
