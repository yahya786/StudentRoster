package c169.lej;

/**
 * Leland Johnson
 */
public class Student {

    protected int id = 0;
    protected int age = 0;
    protected int[] grades;
    protected String firstName = "";
    protected String lastName = "";
    protected String email = "";

    public Student(String firstName, String lastName, int id, int age, String email, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.email = email;
        this.grades = grades;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int[] getGrades() {
        return grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
