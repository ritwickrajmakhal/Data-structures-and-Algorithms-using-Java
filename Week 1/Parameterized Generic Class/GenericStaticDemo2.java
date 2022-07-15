class GenericClass<T> {
    T obj;

    GenericClass(T obj) {
        this.obj = obj;
    }

}

class GenericStaticDemo2 {
    public static <T> void print(T obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        GenericClass<Integer> a = new GenericClass<Integer>(10);

        GenericClass<String> b = new GenericClass<String>("Joy with Java");

        GenericClass<Double> c = new GenericClass<Double>(12.4);

        print(a);
        print(b);
        print(c);

    }
}
