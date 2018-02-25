package basicgrammar;

import java.io.InputStream;
import java.util.Scanner;

import static java.lang.Math.random;


/**
 * Created by yuanqingjing on 2017/12/24
 */
public class Example1 {
    public static void main(String[] args) {
//        getScore();
//        fooBizBaz();
//        System.out.println(getCount());
//        unSure();
        getHighScore(5);
//          getRandom();
    }


    /**
     * 从键盘上读入一个学生成绩，
     * 存放在变量score中，根据
     * score的值输出其对应的成绩等级
     */
    public static void getScore(){
        InputStream inputStream = System.in;
        Scanner scanner =new Scanner(inputStream);
        Integer score = scanner.nextInt();
        System.out.println("输入的分数为："+score);
        if (score>=90){
            System.out.println("您的等级为"+"   A");
        }
        if (score<90&&score>=70){
            System.out.println("您的等级为"+"   B");
        }
        if (score>=60&&score<70){
            System.out.println("您的等级为"+"   C");
        }
        if (score<60){
            System.out.println("您的等级为"+"   D");
        }
    }

    /**
     * 从1循环到150并在每行打印一个值，另外在每个3的倍数行上
     * 打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍
     * 数行上打印输出“baz”
     */
    public static void fooBizBaz(){
        for (int i=1;i<=150;i++){
            System.out.print(i);
            if (i%3==0){
                System.out.print(" foo");
            }
            if (i%5==0){
                System.out.print(" biz");
            }
            if (i%7==0){
                System.out.print(" baz");
            }
            System.out.println();
        }
    }
    /**
     * 求1到100之间所有偶数的和。用while语句分别完成。
     */
    public static int getCount(){
        int i=1;
        int s=0;
        while (i<=100){
            if (i%2==0){
                s=s+i;
            }
            i++;
        }
        return s;
    }

    /**
     * 从键盘读入个数不确定的整数，并判断
     * 读入的正数和负数的个数，输入为0时结束程序。
     */
    public static void unSure(){
        Scanner scanner = new Scanner(System.in);
        Integer integer;
        Integer s=0;
        Integer s1=0;
        while ((integer=scanner.nextInt())!=0){
            if (integer>0){
                s++;
            }else {
                s1++;
            }
        }
        System.out.println("正数的个数为："+s+"    负数的个数为: "+s1);
    }

    /**
     * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
     成绩>=最高分-10  等级为’A’   成绩>=最高分-20  等级为’B’
     成绩>=最高分-30  等级为’C’   其余     等级为’D’
     提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
     */
    public static void getHighScore(int i){
        int score[]=new int[i];
        int i1=0;
        int max =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入完成");
        while (i1<score.length){
            score[i1] =scanner.nextInt();
            System.out.println(score[i1]);
            if (score[i1]>max){
                max=score[i1];
            }
            i1++;

        }
        System.out.println(max);
    }

    /**
     * 定义类Student，包含三个属性：学号number(int)，
     * 年级state(int)，成绩score(int)。创建20个学生
     * 对象，学号为1到20，年级和成绩都由随机数确定，
     * 打印出3年级(state值为3）的学生信息。
     * 提示：生成随机数：Math.randon() ，返回值类型double;
     *四舍五入取整：Math.round()，返回值类型long。
     */
    public static void getRandom(){
        Student students[] = new Student[20];
        for (int i =0;i<students.length;i++){
            Student student = new Student();
            student.setNumber(i+1);
//            System.out.println(Math.random());
            student.setScore((int) (Math.random()*10));
            student.setState((int)Math.round(Math.random()*10));
            students[i]=student;
        }
        for (Student stu:students) {
            System.out.println(stu);
        }

    }
}
