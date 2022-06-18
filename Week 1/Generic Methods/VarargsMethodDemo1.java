public class VarargsMethodDemo1 {
    public static void varargsMethod1(int v[]) {
        System.out.println("Number of arguments: " + v.length + " elements: ");
        for(int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int x[] = {1,2,3,4};
        int y[] = {4,5};
        int z[] = {};
        varargsMethod1(x);
        varargsMethod1(y);
        varargsMethod1(z);

    }
    
}
