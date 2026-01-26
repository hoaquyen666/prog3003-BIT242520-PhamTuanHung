import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("1. LinkedList ban đầu: " + linkedList);

        linkedList.addFirst(5);
        linkedList.addLast(40);
        System.out.println("2. LinkedList thêm đầu đuôi: " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("3. LinkedList cuối cùng: " + linkedList);
    }
}
