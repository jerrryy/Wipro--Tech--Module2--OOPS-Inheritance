public class CollegeStudent extends Student{
    String collegeName;
    String year;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public CollegeStudent(String name, String DOB, long studentID, String collegeName, String year) {
        super(name, DOB, studentID);
        this.collegeName = collegeName;
        this.year = year;
    }

    public CollegeStudent(){

    }
}
