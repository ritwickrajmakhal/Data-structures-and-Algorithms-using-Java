class GenericArray <T> {
    T a[];
    GenericArray(T a[]) {
        this.a = a;
    }

    T getData(int i) {
        return a[i];
    }
    void printData() {
        for(int i=0;i<a.length;i++) {
            System.out.print(getData(i) + " ");
        }
        System.out.println();
    }
    void reverseArray() {
        int front = 0, rear = a.length-1;
        T temp;
        while(front < rear) {
            temp = a[rear];
            a[rear] = a[front];
            a[front] = temp;
            front++; rear--;
        }
    }
}

public class GenericClassArrayDemo {
    public static void main(String[] args) {
        Integer x[] = {10, 20, 30, 40, 50};
        GenericArray<Integer> aInt = new GenericArray<Integer>(x);
        aInt.printData();
        aInt.reverseArray();
        aInt.printData();

        String y[] = {"Ritwick", "Barsa", "Annu", "Situ"};
        GenericArray<String> bString = new GenericArray<String>(y);
        bString.printData();
        bString.reverseArray();
        bString.printData();

        Double z[] = {11.2, 15.6, 45.2, 4.2, 6.3};
        GenericArray<Double> cDouble = new GenericArray<Double>(z);
        cDouble.printData();
        cDouble.reverseArray();
        cDouble.printData();
        
    }
}
