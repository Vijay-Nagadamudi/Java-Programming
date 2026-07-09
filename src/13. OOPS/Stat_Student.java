package OOPS;

public class Stat_Student {
    String Name;
    int Rollno;
    double Percent;
    static int Student_count;

    public Stat_Student(String Name,int Rollno,double Percent){
        this.Name = Name;
        this.Rollno = Rollno;
        this.Percent = Percent;
        Student_count++;
    }

}
