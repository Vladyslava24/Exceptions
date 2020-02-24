package part1;

public class App29 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            if (true) {throw new RuntimeException();}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
        //>> try
        //>> finally
        //>> Exception in thread "main" java.lang.RuntimeException
    }
}
