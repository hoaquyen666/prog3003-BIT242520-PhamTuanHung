public class Lights implements device  {
    @Override
    public void on() {
        System.out.println("Lights on");
    }

    void dim()
    {
        System.out.println("Dim ...");
    }
}
