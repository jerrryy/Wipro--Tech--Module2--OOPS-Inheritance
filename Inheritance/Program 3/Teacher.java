
public class Teacher extends Person{


    double salary;
    String subject;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String DOB, double salary, String subject) {
        super(name, DOB);
        this.salary = salary;
        this.subject = subject;
    }
    public Teacher(){

    }
}

