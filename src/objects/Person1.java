package objects;

/**
 * Created by jingjing on 2018/2/11.
 */
public class Person1 {
    private  String name ;
    private  int age;
    private  String school;
    private  String major;

    public Person1(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Person1(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

    public Person1(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
