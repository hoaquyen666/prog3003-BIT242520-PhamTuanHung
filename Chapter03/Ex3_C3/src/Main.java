import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {

    static int[] arr = {1, 2, 3, 4, 0, 9, 8, 7, 6};

    public static void main(String[] args)
    {
        CompletableFuture<int[]> future =
                CompletableFuture.supplyAsync(() -> {
                    return arr;
                });

        CompletableFuture<List<Integer>> futureAfterFilter =
                future.thenApply(numbers -> {
                    return Arrays.stream(numbers)
                            .filter(n -> n % 2 != 0)
                            .sorted()
                            .boxed()
                            .collect(Collectors.toList());
                });

        CompletableFuture<String> futureString =
                futureAfterFilter.thenApply(result -> {
                    return "arr: " + result;
                });

        futureString.thenAccept(System.out::println);
        futureString.join();
    }
}
