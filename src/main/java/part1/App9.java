package part1;

public class App9 {
    public static void main(String[] args) {
        f(null);
    }
    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }
    //RUNTIME ERROR: Exception in thread "main" java.lang.StackOverflowError
}
