package basicgrammar;

/**
 * Created by yuanqingjing on 2017/12/24
 */


/**
 * .(1)定义类Pritimive，在类中定义一个有3个元素的boolean类型的数组t作为其成员变量。
 * 数组元素未赋值。定义类Array1，在Array1的main()方法中创建Pritimive对象d，输出其成员变量t的三个元素值。
 练习目的：检验基本数据类型数组创建时的自动赋值。
 */
public class Pritimive {
    private boolean t[];

    public Pritimive() {
        t=new boolean[3];
    }

    public Pritimive(boolean[] t) {
        this.t = t;
    }

    public boolean[] getT() {
        return t;
    }

    public void setT(boolean[] t) {
        this.t = t;
    }
}
