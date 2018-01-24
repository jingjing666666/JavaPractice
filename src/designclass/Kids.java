package designclass;

/**
 * Created by jingjing on 2018/1/24.
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public  void  printAge(){
        System.out.println("输出kids类的年龄");
        System.out.println(yearsOld);

    }

    public static void main(String[] args) {
        Kids kid =new Kids(0,10000,18);
        kid.employeed();
        kid.manOrWoman();
    }
    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
