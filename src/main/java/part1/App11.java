package part1;

public class App11 {
    public static void main(String[] args) {
        double d = sqr(10.0); // ну, и чему равно d?
        System.out.println(d);
    }
   /* public static double sqr(double arg) {
        // nothing
    }*/
    //>> COMPILATION ERROR: Missing return statement
    public static double sqr(double arg) {
        while (true); // Удивительно, но КОМПИЛИРУЕТСЯ!
    }
}
