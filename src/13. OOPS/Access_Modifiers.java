package OOPS;

public class Access_Modifiers {
    // we have default class by default
    public static class Student{
        String name; // This is a default variable and can be used anywhere within package
        private int rollno;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vijay";
        s1.rollno = 45;
        System.out.println(s1.rollno);

    }
}

// Private can be used under the same class Access_mmodifiers but not in other classes
