class GC2<T1,T2>{
    T1 obj1;
    T2 obj2;
    GC2(T1 obj1, T2 obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

public class GC2Test {
    public static void main(String[] args) {
        GC2 <String,Integer> obj1 = new GC2<String,Integer>("GC", 9);
        obj1.print();

        GC2 <Integer,Double> obj2 = new GC2<Integer,Double>(123, 9.2);
        obj2.print();
    }
}
