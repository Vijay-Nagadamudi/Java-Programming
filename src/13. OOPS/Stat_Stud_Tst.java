package OOPS;

public class Stat_Stud_Tst {
    public static void main(String[] args) {
        Stat_Student.Student_count = 100;
        Stat_Student s1 = new Stat_Student("Vijay",21,95);
        System.out.println(s1.Student_count);
        Stat_Student s2 = new Stat_Student("Ishwarya",20,99);
        System.out.println(s2.Student_count);
        System.out.println(s2.Student_count);

    }
}
