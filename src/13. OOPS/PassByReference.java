package OOPS;

public class PassByReference {
    public static class Student{
        String name;
        int rollno;
        double percent;
    }
    static void FUNC(Student s1){
        // changes name to Ajay
        s1.name = "Ajay";
        return;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vijay";
        System.out.println(s1.name);
        System.out.println("After change");
        FUNC(s1);
        System.out.println(s1.name);
    }

}
