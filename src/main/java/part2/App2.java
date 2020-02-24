package part2;

public class App2 {
    public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
        throw new Exception(); // а кидаем только Exception
    }
    //Мы можем предупредить о большем, чем мы бросаем
}
