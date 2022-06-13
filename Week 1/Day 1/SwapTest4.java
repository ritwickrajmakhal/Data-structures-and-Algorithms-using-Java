class Person {
    String name;
    Double marks;

    Person(String name, Double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class SwapTest4 {
    public static void swap(Object x, Object y) {
        Object temp;
        temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        Object p1 = new Person("Sumit", 99.9);
        Object p2 = new Person("Sumit", 66.6);
        System.out.println("p1 = " + p1 + " p2 = " + p2);
        swap(p1, p2);
        System.out.println("p1 = " + p1 + " p2 = " + p2);
    }
}
