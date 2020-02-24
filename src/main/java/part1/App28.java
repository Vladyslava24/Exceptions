package part1;

public class App28 {
    public static void main(String[] args) {
       /* try {
            System.err.println("try");
        } finally {
            System.err.println("finally");
        }*/
      /*  try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }*/
        //>> finally
        //>> Exception in thread "main" java.lang.RuntimeException
       /* try {
            return;
        } finally {
            System.err.println("finally");
        }*/
        //>> finally
        /*try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }*/
        //>> Process finished with exit code 42
       /* try {
            Runtime.getRuntime().exit(42);
        } finally {
            System.err.println("finally");
        }*/
        //>> Process finished with exit code 42
        try {
            Runtime.getRuntime().halt(42);
        } finally {
            System.err.println("finally");
        }
        //>> Process finished with exit code 42
    }
}
