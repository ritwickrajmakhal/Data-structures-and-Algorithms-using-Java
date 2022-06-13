public class SwapTest3 {
    public static <T>void swap(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
    }
    public static void main(String[] args) {
        String x = "99";
        String y = "66";
        System.out.println("x = " + x + " y = " + y);
        swap(x,y);
        System.out.println("x = " + x + " y = " + y);

    }
}
