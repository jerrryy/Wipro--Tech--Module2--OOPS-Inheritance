public class Student extends Person{

    long StudentID;

    public long getStudentID() {
        return StudentID;
    }

    public void setStudentID(long studentID) {
        StudentID = studentID;
    }

    public Student(String name, String DOB, long studentID) {
        super(name, DOB);
        StudentID = studentID;
    }

    public Student(){

    }
}
