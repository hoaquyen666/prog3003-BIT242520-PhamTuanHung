public class Main {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new Num());
            t.start();
        }
    }
}
