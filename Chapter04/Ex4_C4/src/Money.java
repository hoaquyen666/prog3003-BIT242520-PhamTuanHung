import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Money {
    public static void main(String[] args)
    {
        List<String> prices = Arrays.asList("$10", "$20", "$50");
        List<Integer> intPrices = new ArrayList<>();

        Function<String, Integer> convert = str -> Integer.parseInt(str.substring(1));

        for (String price : prices)
        {
            Integer n = convert.apply(price);
            intPrices.add(n);
        }

        System.out.println(intPrices);
    }
}
