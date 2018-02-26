package designclass;

/**
 * Created by jingjing on 2018/2/24.
 */
public class Circle {
    private double radius;

    public Circle() {
       this.radius=3;
        System.out.println("radius"+radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     * @return
     */
    public double findArea(){
        System.out.println(3.14*radius*radius);
        return 3.14*Math.pow(radius,2.0);
    }
}
