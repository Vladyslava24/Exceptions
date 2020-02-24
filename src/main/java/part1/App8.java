package part1;

public class App8 {
    public static void main(String[] args) {
        Error ref = new Error(); // создаем экземпляр
        throw ref;               // "бросаем" его
    }
    //RUNTIME ERROR: Exception in thread "main" java.lang.Error
}
