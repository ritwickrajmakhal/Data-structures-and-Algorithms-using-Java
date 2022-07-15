class Student{
    String name;
    int marks[] = new int[3];

    Student(String name, int m[]){
        this.name = name;
        marks = m;
    }
    public void printData(){
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
}
public class GenericMultiArraysDemo{
    public static void main(String[] args) {
        
    }
}