import java.util.function.Consumer;
import java.util.function.Supplier;

public class GetRandomNumber {
    public static void main(String[] args)
    {
        Supplier<Double> randomGenerator = () -> Math.random() * 100;
        Consumer<Double> printNumber = num -> {
            System.out.println("Số may mắn: " + num);
        };

        Double luckyNumber = randomGenerator.get();
        printNumber.accept(luckyNumber);
    }
}
