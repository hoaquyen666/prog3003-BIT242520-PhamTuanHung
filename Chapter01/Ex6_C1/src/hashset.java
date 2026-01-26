import java.util.HashSet;

public class hashset {
    public static void main(String[] args)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] inputArr = {5, 2, 9, 2, 5, 8, 1};
        for(int n : inputArr)
        {
            boolean isAdded = hashSet.add(n);
            if (!isAdded) {
                System.out.println("Bỏ qua " + n + " (vì đã tồn tại)");
            }
        }
        System.out.println("\nKết quả HashSet cuối cùng: " + hashSet);
    }
    // Giải thích:
    // HashSet không cho phép các phần tử trùng lặp. Nếu cố gắng thêm một đối tượng đã có, phần tử đó sẽ bị bỏ qua
    // Lý do kết quả là "1, 2, 5, 8, 9" không phải "5, 2, 9, 8, 1": công thức HashCode của một số nguyên chính là giá trị của số đó
}
