package Demo02;

public class Rect implements Ishape {
    private double x;
    private double y;
    public Rect(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public void length() {
        System.out.println("长方形的周长为:"+2*(x+y));
    }


    public void area() {
        System.out.println("长方形的面积为:"+(x*y));
    }


}
