import java.util.function.Predicate;

public class CheckEvenNumber {
    public static void main(String[] args)
    {
        Predicate<Integer> isEvent = n -> n % 2 != 0;
        int a = 1;
        System.out.println(a + ": " + isEvent.test(a));
    }
}
