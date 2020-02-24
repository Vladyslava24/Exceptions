package part1;

public class App12 {
    public static void main(String[] args) {
        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
    }
   /* public static double sqr(double arg) {
        while (true); // Вот тут мы на века "повисли"
    }*/
   /*public static double sqr(double arg) {
       if (System.currentTimeMillis() % 2 == 0) {
           return arg * arg; // ну ладно, вот твой double
       } else {
           while (true);     // а тут "виснем" навсегда
       }
   }*/

   //Но механизм исключений позволяет НИЧЕГО НЕ ВОЗВРАЩАТЬ!

   /* public static double sqr(double arg) {
        throw new RuntimeException();
    }*/

    public static double sqr(double arg) {// согласно объявлению метода ты должен вернуть double
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;             // ок, вот твой double
        } else if (time % 2 == 1) {
            while (true);                 // не, я решил "повиснуть"
        } else {
            throw new RuntimeException(); // или бросить исключение
        }
    }
}
