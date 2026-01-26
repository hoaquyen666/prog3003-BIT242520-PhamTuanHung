import java.util.TreeSet;

public class treeset {
    public static void main(String[] args)
    {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("John");
        treeSet.add("Alice");
        treeSet.add("Zack");
        treeSet.add("Bob");
        System.out.println("TreeSet ban đầu: " + treeSet);
        System.out.println("TreeSet phần tử đầu tiên: " + treeSet.getFirst());
        System.out.println("TreeSet phần tử cuối cùng: " + treeSet.getLast());
    }
}
