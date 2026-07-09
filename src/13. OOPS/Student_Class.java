package OOPS;

public class Student_Class {
    public static class Student{
        String Name;
        private int RollNo;
        double percent;
    }

    static void func(Student s1){
        //1.RollNo = 0;
        System.out.println(s1.RollNo);
        return;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Vijay";
        s1.percent = 97.95;
        s1.RollNo = 21;


        System.out.println(s1.Name);
        System.out.println(s1.RollNo);
        func(s1);
    }
}
