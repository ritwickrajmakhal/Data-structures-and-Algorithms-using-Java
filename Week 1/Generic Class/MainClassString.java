class specificArrayString {
    String a[];

    specificArrayString(String a[]) {
        this.a = a;
    }

    void printString() {
        for (String x : a) {
            System.out.print(x + " ");
        }
    }

    void reverseString() {
        int j = a.length - 1;
        for (int i = 0; i <= j; i++) {
            String temp;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }
}

class MainClassString {
    public static void main(String[] args) {
        String arr[] = { "Ritwick" , "Raj" , "Makhal" , "Sonali" , "Somtirtha" };
        specificArrayString a = new specificArrayString(arr);
        a.printString();
        a.reverseString();
        System.out.println();
        a.printString();
    }
}