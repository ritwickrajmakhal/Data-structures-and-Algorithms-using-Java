class specificArrayInt {
    int a[];

    specificArrayInt(int a[]) {
        this.a = a;
    }

    void printInt() {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    void reverseInt() {
        int j = a.length - 1;
        for (int i = 0; i <= j; i++) {
            int temp;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }
}

class MainClassInt {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        specificArrayInt a = new specificArrayInt(arr);
        a.printInt();
        a.reverseInt();
        System.out.println();
        a.printInt();
    }
}