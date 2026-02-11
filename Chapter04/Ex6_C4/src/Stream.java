import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int result = numbers.stream()
                .filter(n -> n % 2 == 0)          // Lấy chẵn: 2, 4, 6
                .mapToInt(n -> n * n)             // Bình phương (chuyển sang IntStream): 4, 16, 36
                .sum();                           // Tổng: 4 + 16 + 36 = 56
        System.out.println(result);
    }
}
