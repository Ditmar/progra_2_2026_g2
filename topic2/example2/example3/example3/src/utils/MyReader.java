package utils;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class MyReader extends  BufferedReader{

    public MyReader(Reader in) {
        super(in);
    }
    public MyReader() {
        super(new InputStreamReader(System.in));
    }
    public Integer readInt() {
        try {
            String ioLine = this.readLine();
            return Integer.parseInt(ioLine);
        } catch(IOException error) {
            System.out.println("ERROR : " + error.getMessage());
        }
        return null;
    }

    public Double readDouble() {
        try {
            String ioLine = this.readLine();
            return Double.parseDouble(ioLine);
        } catch(IOException error) {
            System.out.println("ERROR : " + error.getMessage());
        }
        return null;
    }
    
}
