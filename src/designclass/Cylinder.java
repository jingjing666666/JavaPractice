package designclass;

/**
 * Created by jingjing on 2018/2/24.
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length=1;
        System.out.println("length"+length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double findArea() {
        return super.findArea();
    }

    /**
     * 计算圆柱体积
     * @return
     */
    public double findVolume(){
        return  super.findArea()*length;
    }
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.findVolume());

    }
}
