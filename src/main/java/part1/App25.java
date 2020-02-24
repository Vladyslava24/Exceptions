package part1;

public class App25 {
    public static void main(String[] args) {
        /*try {
        } catch (Exception e) {
        } catch (RuntimeException e) {
        }*/
        //>> COMPILATION ERROR: Exception 'java.lang.RuntimeException' has alredy been caught
        try {
        } catch (Error e) {
        } catch (RuntimeException e) {
        }
    }
}
