package OOPS;

public class Student {
    String Name;
    int Rollno;
    double percent;

    public Student(){
        // Default Constructor
        // No need to write always
        // When in main function we are making objects and passing using varous cases (Check notes) we use this
    }

    public Student(String Name,int Rollno,double percent){
        this.Name = Name;
        this.Rollno = Rollno;
        this.percent = percent;
    }

    public void get_rollno(){
        System.out.println(Rollno);
        return;
    }

    public void set_rollno(int x){
        Rollno = x;
        return;
    }

    // Here we need no use of getters and setters coz rollno is not a private variable
}
