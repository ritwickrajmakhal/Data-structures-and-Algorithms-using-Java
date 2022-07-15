class PairData<T ,V>{
    private T x;
    private V y;

    public PairData(T a, V b){
        x = a;
        y = b;
    }
    public T getTValue(){
        return x;
    }
    public V getVvalue(){
        return y;
    }
    public void printData() {
        System.out.println(getTValue() + ", " + getVvalue());
    }
}

public class MultiParameterGenericClassTest{
    public static void main(String[] args) {
        PairData<String,String> a = new PairData<String,String>("Debasis","Samanta");
        a.printData();

        PairData<String,Integer> b = new PairData<String,Integer>("Debasis",9);
        b.printData();
        
        PairData<Integer,String> c = new PairData<Integer,String>(99,"Samanta");
        c.printData();

        PairData<Integer,Double> d = new PairData<Integer,Double>(99,99.9);
        d.printData();

    }
}