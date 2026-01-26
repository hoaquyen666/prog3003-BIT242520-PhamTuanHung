import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args)
    {
        TreeMap<String, Double> treeMap = new TreeMap<>();
        String[] s = {"Laptop", "Mouse", "Keyboard"};
        double[] d = {1500.0, 25.0, 50.0};
        for (int i = 0; (double)i < d.length; i ++) {
            treeMap.put(s[i], d[i]);
        }
        System.out.println("TreeMap ban đầu: " + treeMap);

        Map<String, Double> result = treeMap.subMap("K", "M");
        System.out.println("TreeMap bắt đầu từ K đến M: " + result);
    }
}
