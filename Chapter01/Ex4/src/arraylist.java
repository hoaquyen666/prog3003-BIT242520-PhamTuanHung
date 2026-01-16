import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        String[] fruits = {"Apple", "Banana", "Orange"};
        for(String add : fruits)
        {
            arrayList.add(add);
        }

        System.out.println("1. ArrayList ban đầu: " + arrayList);

        arrayList.add(1, "Mango");

        System.out.println("2. ArrayList thêm Mango: " + arrayList);

        int indexBanana = arrayList.indexOf("Banana");
        if (indexBanana != -1) {
            arrayList.set(indexBanana, "Grapes");
        }
        System.out.println("3. ArrayList đổi Banana thành Grapes: " + arrayList);

        boolean check = arrayList.contains("Apple");
        if (check) {
            System.out.println("4. Có Apple");
        } else {
            System.out.println("4. Không Apple");
        }
    }
}
