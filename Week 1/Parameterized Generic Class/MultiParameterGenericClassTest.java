class FairData<T ,V>{
    private T x;
    private V y;

    public FairData(T a, V b){
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
        FairData<String,String> a = new FairData<String,String>("Debasis","Samanta");
        a.printData();

        FairData<String,Integer> b = new FairData<String,Integer>("Debasis",9);
        b.printData();
        
        FairData<Integer,String> c = new FairData<Integer,String>(99,"Samanta");
        c.printData();

        FairData<Integer,Double> d = new FairData<Integer,Double>(99,99.9);
        d.printData();

    }
}