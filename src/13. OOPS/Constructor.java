package OOPS;

public class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student("Vijay",21,97.5);
        // Student() here acts like a function here that calls contruuctor in stiudent class file;
        System.out.println(s1.Name);
        System.out.println(s1.Rollno);


    }
}
