import java.util.Iterator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileIterator implements Iterator {
    private File file;
    private FileReader fr;
    private String line;
    private BufferedReader reader;

    public FileIterator(String Input) {
        try {
            file = new File(Input);
            fr = new FileReader(file);
            reader = new BufferedReader(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean hasNext() {
        try {
            if (reader.ready()) return true;
            return false;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String next() {
        try {
            line = reader.readLine();
            if (line != null) {
                return line;
            } else {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        FileIterator it = new FileIterator("src/input.txt");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}