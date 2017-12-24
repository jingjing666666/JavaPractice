package basicgrammar;

/**
 * Created by yuanqingjing on 2017/12/24
 */
public class Array1 {
    public static void main(String[] args) {
        Pritimive d = new Pritimive();
        boolean t[]= new boolean[]{true,true,true};
        Pritimive d1 = new Pritimive(t);
        boolean a[] =d1.getT();
        System.out.println("获取对象属性的值：");
        for (boolean i:a) {
            System.out.println(i);
        }
    }
}
