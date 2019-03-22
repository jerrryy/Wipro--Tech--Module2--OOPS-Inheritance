
public class Employee extends Person{

    double annualSalary;
    int year;
    String insuranceNum;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInsuranceNum() {
        return insuranceNum;
    }

    public void setInsuranceNum(String insuranceNum) {
        this.insuranceNum = insuranceNum;
    }

    public Employee(){
    }

    public Employee(double annualSalary, int year, String insuranceNum, String name){
        super(name);
        this.annualSalary = annualSalary;
        this.year = year;
        this.insuranceNum = insuranceNum;
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Employee employee = new Employee(400000, 2018, "IN56748","Ajay");

        System.out.println("Name =" + employee.getName());
        System.out.println("Annual Salary =" + employee.getAnnualSalary());
        System.out.println("Year of joining =" + employee.getYear());
        System.out.println("National Insurance Number =" + employee.getInsuranceNum());
    }
}