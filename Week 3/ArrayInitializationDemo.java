import java.util.Scanner;

class Array{
    int a[] = new int[100];
    int size;
    void loadArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: < 100");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+(i+1)+" number");
            a[i] = sc.nextInt();
        }
        System.out.println("Length = " + a.length);
        
    }   
}

public class ArrayInitializationDemo {
    public static void main(String[] args) {
        Array a = new Array();
        a.loadArray();
    }
}
