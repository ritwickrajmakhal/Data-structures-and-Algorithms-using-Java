class Student {
    String name;
    Double marks;

    Student(String name, Double marks) {
        this.name = name;
        this.marks = marks;

    }

    class GenericClass<T> {
        T obj;
        GenericClass(T obj) {
            this.obj = obj;
        }
        public T getObject() {
            return this.obj;
        }
    }
}
class GenericClassTest2 {
    public static void main(String[] args) {
        Student s = new Student("Ritwick", 99.9);
        GenericClass<Student> tObj = new GenericClass<Student>(s);
        System.out.println("Name : " + tObj.getObject().name);
        System.out.println("Marks : " + tObj.getObject().marks);

    }
}