// 1. Viết một phương thức tĩnh (static) tên là printArray.
// 2. Phương thức nhận vào một mảng của bất kỳ kiểu đối tượng nào E[].
// 3. In tất cả các phần tử của mảng đó ra màn hình.
// 4. Viết hàm main để kiểm thử với mảng Integer[] và String[], sử dụng printArray.

import java.util.Arrays;

public class PrintArray {
    public static <E> void printArray(E[] inputArray)
    {
        for(E elmt : inputArray)
        {
            System.out.print(elmt + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };

        String[] strArray = { "Nishikigi", "Chisato" };

        System.out.println("int: ");
        printArray(intArray);

        System.out.println("arr:");
        printArray(strArray);
    }
}
