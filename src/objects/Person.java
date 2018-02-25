package objects;

/**
 * Created by jingjing on 2018/1/22.
 */

/**
 * (1)创建Person类的对象，设置该对象的name、age和sex属性，
 * 调用study方法，输出字符串“studying”，调用showAge()方法显
 * 示age值，调用addAge()方法给对象的age属性值增加 i 岁。
 *(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */
public class Person {
    private String name;
    private  int age;
    private  int sex;

    public Person() {
        this.sex = 18;
        this.name="小可爱";
    }

    public void study(){
        System.out.println("我爱学习"+"studying");
    }
    public void addAge(){
        age=age+1;
        System.out.println(age);
    }

    public void  showAge(){
        System.out.println("您的年龄为:"+age);
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
