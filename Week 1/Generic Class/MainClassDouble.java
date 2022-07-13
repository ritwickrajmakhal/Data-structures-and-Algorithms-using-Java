class specificArrayDouble {
    Double a[];

    specificArrayDouble(Double a[]) {
        this.a = a;
    }

    void printDouble() {
        for (Double x : a) {
            System.out.print(x + " ");
        }
    }

    void reverseDouble() {
        int j = a.length - 1;
        for (int i = 0; i <= j; i++) {
            Double temp;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }
}

class MainClassDouble {
    public static void main(String[] args) {
        Double arr[] = { 1.5, 2.5, 3.6, 4.5, 5.4, 6.4, 7.2, 8.3, 9.7, 10.4 };
        specificArrayDouble a = new specificArrayDouble(arr);
        a.printDouble();
        a.reverseDouble();
        System.out.println();
        a.printDouble();
    }
}