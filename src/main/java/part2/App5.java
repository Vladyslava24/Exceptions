package part2;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App5 {
    // пугаем ОБОИМИ исключениями
    public static void main(String[] args)  throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}
