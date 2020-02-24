package part1;

public class App10 {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
    }
    //output:
    //>> RUNTIME ERROR: Exception in thread "main" java.lang.Error
    //>> sout
    //or
    //>> sout
    //>> RUNTIME ERROR: Exception in thread "main" java.lang.Error
}
