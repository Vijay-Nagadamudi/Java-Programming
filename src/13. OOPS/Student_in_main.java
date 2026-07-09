package OOPS;

public class Student_in_main {
    public static void main(String[] args) {
        class Student{
            String Name;
            int RollNo;
            double percent;
        }

        Student s1 = new Student();
        s1.Name = "Vijay";
        System.out.println(s1.Name);
    }
}


// Here issue is class is for only that main method
// Functions defined outside main function won't access this class inside main function