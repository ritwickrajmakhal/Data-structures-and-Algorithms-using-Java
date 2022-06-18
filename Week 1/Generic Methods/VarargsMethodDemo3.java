public class VarargsMethodDemo3 {
    // Defining a varargs method using ellipsis
    public static void varargsMethod3(Object ...v) {
        System.out.println("Number of arguments: " + v.length + " elements: ");
        for(Object x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        varargsMethod3(9, "String", 2.3, true);
        varargsMethod3();
        varargsMethod3(1, -2, 3, -5);
    }
    
}
