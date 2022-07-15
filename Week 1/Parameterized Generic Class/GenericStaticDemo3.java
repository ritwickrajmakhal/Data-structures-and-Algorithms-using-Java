class GenericClass<T>{
    T obj;
    GenericClass(T obj){
        this.obj = obj;
    }
}
public class GenericStaticDemo3 {
    public static void main(String[] args) {
        GenericClass<Integer> a = new GenericClass<Integer>(10);
        // GenericClass<int> a = new GenericClass<int>(10); // Error

        GenericClass<String> b = new GenericClass<String>("Joy with Java");

        GenericClass<Double> c = new GenericClass<Double>(1.2);
        // GenericClass<double> c = new GenericClass<double>(1.2); // Error

    }
}
