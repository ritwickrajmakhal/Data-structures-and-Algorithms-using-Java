public class VarargsMethodDemo2 {
    // Defining a varargs method using ellipsis
    public static void varargsMethod2(int ...v) {
        System.out.println("Number of arguments: " + v.length + " elements: ");
        for(int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        varargsMethod2(9);
        varargsMethod2(1, -2, 3, -5);
        varargsMethod2();
    }
    
}
