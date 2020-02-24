package part2;

public class App6 {
    public static void main(String[] args) {
        /*try {
            throw new Exception();
        } catch (Exception e) {
            // ...
        }*/
        try {
            throw new Exception();
        } catch (Throwable e) {
            // ...
        }
    }
}
