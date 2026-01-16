public class Test<T> {
    private T object;

    public void set(T t)
    {
        object = t;
    }

    public T get()
    {
        return object;
    }

    public static void main(String[] args)
    {
        Test<Integer> integerTest = new Test<>();
        integerTest.set(1);
        System.out.println("Object integer: " + integerTest.get());

        Test<String> stringTest = new Test<>();
        stringTest.set("Nishikigi Chisato");
        System.out.println("String Object: " + stringTest.get());
    }
}
