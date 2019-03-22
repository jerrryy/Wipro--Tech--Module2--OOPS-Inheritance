public class Test {

        public static void main(String[] args) {

            Teacher teacher = new Teacher("Ajay","12/07/1992",450000,"Data Structures");
            CollegeStudent collegeStudent = new CollegeStudent("Aryan","01/05/1998",1536310047,"AIMT","Fourth");

            System.out.println("Teacher's Details:");
            System.out.println("Name =" + teacher.getName());
            System.out.println("DOB =" + teacher.getDOB());
            System.out.println("Subject =" + teacher.getSubject());
            System.out.println("Annual Salary =" + teacher.getSalary());

            System.out.println("---------------------------");

            System.out.println("Student's Details:");
            System.out.println("Name =" + collegeStudent.getName());
            System.out.println("DOB =" + collegeStudent.getDOB());
            System.out.println("Student ID =" + collegeStudent.getStudentID());
            System.out.println("College Name =" + collegeStudent.getCollegeName());
            System.out.println("Year =" + collegeStudent.getYear());
        }

}
