import java.util.HashMap;

public class hashmap {
    public static void main(String[] args)
    {
        HashMap<Integer, String> hashMap = new HashMap<>();
        int[] id = {101, 102, 103};
        String[] name = {"Ann", "Peter", "Marry"};
        for (int i = 0; i < id.length; i++) {
            hashMap.put(id[i], name[i]);
        }
        System.out.println("1. HashMap ban đầu: " + hashMap);

        String name102 = hashMap.get(102);
        System.out.println("2. Tên của ID 102: " + name102);

        int check = 105;
        boolean hasID105 = hashMap.containsKey(check);
        if (!hasID105) {
            System.out.println("Không tìm thấy ID " + check + "Thêm 105");
            hashMap.put(check, "Unknown");
        } else {
            System.out.println("ID " + check + " đã tồn tại");
        }
        System.out.println("3. Danh sách sau khi cập nhật: " + hashMap);
    }
}
