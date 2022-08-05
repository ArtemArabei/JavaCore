import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exception extends Throwable {
    public Exception(String message) {
    }

    public Exception() {

    }

    public void readFile(String path) {
        try {
            File f = new File(path);
            BufferedReader fin = new BufferedReader(new FileReader(f));
            String line;
            while ((line = fin.readLine()) != null)
                System.out.println(line);
        } catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Looser");
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Exception test = new Exception();
        test.readFile("c:\\Users\\Artem\\TestException2.txt");
        test.readFile("c:\\Users\\Artem\\TestException.txt");
    }
}
