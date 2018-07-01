package Task5;

public class Student {


    private int gpa;
    private int age;
    private String fullName;


    public Student(int age, int gpa, String fullName) {
        this.gpa = gpa;
        this.age = age;
        this.fullName = fullName;
    }

    public Student() {
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
