
public class Person {

    String name;

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    String DOB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, String DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    public Person() {
    }
}

