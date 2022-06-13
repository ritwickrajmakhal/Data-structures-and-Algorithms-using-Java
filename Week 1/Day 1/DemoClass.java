public class DemoClass {
    // Defining a generic method to print any data type
    <T> void genericPrint(T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        DemoClass aObj = new DemoClass();
        aObj.genericPrint(101);
        aObj.genericPrint("Joy with java");
        aObj.genericPrint(3.142);

    }
}
