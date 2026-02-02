public class Main {
    public static void main(String[] args)
    {
        WorkerThread wt = new WorkerThread();
        wt.start();

        WorkerRunnable wr = new WorkerRunnable();
        Thread thread = new Thread(wr);
        thread.start();
    }
}
