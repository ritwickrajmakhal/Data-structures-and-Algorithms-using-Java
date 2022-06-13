public class StaticGenericMethodDemo {
    // Defining a static generic method to print any data type
    static <T> void genericPrint(T t){
        System.out.println(t.getClass().getName() + ":" + t);
    }
    public static void main(String[] args) {
        genericPrint(101);
        genericPrint("Joy with java");
        genericPrint(3.142);
    }    
}
