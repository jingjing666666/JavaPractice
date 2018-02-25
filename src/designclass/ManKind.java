package designclass;

/**
 * Created by jingjing on 2018/1/24.
 */

/**
 * (1)定义一个ManKind类，包括
 *成员变量 int sex 和 int salary；
 *方法 void manOrWorman()：根据sex的值显示“man”(sex==1)或者“women”(sex==0)；
 *方法 void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。
 *(2)定义类Kids1继承ManKind，并包括
 *成员变量 int yearsOld；
 *方法 printAge() 打印 yearsOld 的值。
 *(3)在Kids1类的main方法中实例化Kids1的对象 someKid，用该对象访问其父类的成员变量及方法。
 */
public class ManKind {
    private  int sex;
    private  int salary;

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex==1){
            System.out.println("man");
        }else{
            System.out.println("woman");
        }
    }

    public void employeed(){
        if (salary==0){
            System.out.println("no job");
        }else {
            System.out.println("job");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
