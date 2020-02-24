package part2;

public class App8 {
    // пугаем Exception
    public static void main(String[] args) throws Exception {
        /*Throwable t = new Exception(); // и лететь будет Exception
        throw t; // но тут ошибка компиляции */
        //>> COMPILATION ERROR: unhandled exception: java.lang.Throwable

       /* Object ref = "Hello!";  // ref указывает на строку
        char c = ref.charAt(0); // но тут ошибка компиляции
        */
       //>> COMPILATION ERROR: Cannot resolve method 'charAt(int)'
    }
}
