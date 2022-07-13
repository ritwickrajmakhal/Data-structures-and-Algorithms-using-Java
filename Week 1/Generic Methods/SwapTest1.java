public class SwapTest1 {
    public static <T>void swap(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
    }
    public static void main(String[] args) {
        int x = 99;
        int y = 66;
        System.out.println("x = " + x + " y = " + y);
        swap(x,y);
        System.out.println("x = " + x + " y = " + y);

    }
}
