import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> cities = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");
        // So sánh độ dài của chuỗi s1 và s2 (s1.length() - s2.length())
        Collections.sort(cities, (s1, s2) -> s1.length() - s2.length());
        System.out.println(cities);
    }
}
