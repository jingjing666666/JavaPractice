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

    @Override
    public void employeed() {
        super.employeed();
        System.out.println("but kids should study and no job ");
    }

    public static void main(String[] args) {
        Kids kids = new Kids(1,100,3);
        kids.employeed();
        ManKind manKind = new ManKind(1,300);
        manKind.employeed();

//        String s ="今天有个猪";
//        System.out.println(s.length());
////        Kids kid =new Kids(0,10000,18);
////        kid.employeed();
////        kid.manOrWoman();
    }
    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
