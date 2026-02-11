public class Main {
    public static void main(String[] args) {
        MathOperation cong = (a, b) -> a + b;
        MathOperation tru = (a, b) -> a - b;
        MathOperation nhan = (a, b) -> a * b;
        MathOperation chia = (a, b) -> a / b;

        System.out.println(cong.compute(1,2));
        System.out.println(tru.compute(1,2));
        System.out.println(nhan.compute(1,2));
        System.out.println(chia.compute(1,2));
    }
}