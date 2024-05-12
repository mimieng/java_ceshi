package Demo02;
public class Circle implements Ishape {
    private double r;
    private double Ti = 3.14;

    public Circle(int r) {
        this.r = r;
    }


    public void length() {
        System.out.println("圆的周长为:" + (2 * Ti * r));
    }


    public void area() {
        System.out.println("圆的面积为:" + (Ti * r * r));

    }
}
