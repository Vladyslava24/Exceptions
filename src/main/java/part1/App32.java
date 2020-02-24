package part1;

public class App32 {
    public static void main(String[] args) {
        System.err.println(f());
    }
    /*public static int f() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }*/
    //>> Exception in thread "main" java.lang.RuntimeException
    public static int f() {
        try {
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
    }
    //>> Exception in thread "main" java.lang.RuntimeException
}
