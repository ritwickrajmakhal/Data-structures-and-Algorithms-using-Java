class Student{
    String name;
    int marks[] = new int[3];

    Student(String name, int ...m){
        this.name = name;
        marks = m;
    }
    public void printStudent(){
        System.out.println("Name : " + name);
        System.out.println("Scores : " + marks[0] + " " + marks[1] + " " + marks[2]);
    }
}
class GenericMultiArrays<T,S>{
    T a[];
    S b[];
    GenericMultiArrays(T a[], S b[]){
        this.a = a;
        this.b = b;
    }
    T getDataT(int i){
        return a[i];
    }
    S getDataS(int i){
        return b[i];
    }
    void printDataT(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(getDataT(i) + " ");
        }
        System.out.println();
    }
    void printDataS(){
        for (int i = 0; i < b.length; i++) {
            ((Student) b[i]).printStudent();
        }
        System.out.println();
    }
    void reverseArrayT(){
        int front = 0, rear = a.length - 1;
        T temp;
        while(front < rear){
            temp = a[rear];
            a[rear] = a[front];
            a[front] = temp;
            rear--;
            front++;
        }
    }
    void reverseArrayS(){
        int front = 0, rear = b.length - 1;
        S temp;
        while(front < rear){
            temp = b[rear];
            b[rear] = b[front];
            b[front] = temp;
            rear--;
            front++;
        }
    }
}
public class GenericMultiArraysDemo{
    public static void main(String[] args) {
        String t[] = {"A", "B", "C"};

        Student s[] = new Student[3];
        s[0] = new Student("Ritwick", 86,56,100);
        s[1] = new Student("Partha", 14,25,10);
        s[2] = new Student("Sonali", 24,86,56);

        GenericMultiArrays<String, Student> arrayData = new GenericMultiArrays<String, Student>(t,s);
        arrayData.printDataT();
        arrayData.reverseArrayT();

        arrayData.printDataS();
        arrayData.reverseArrayS();

        arrayData.printDataT();
        arrayData.printDataS();
    }
}