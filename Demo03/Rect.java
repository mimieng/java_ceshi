package Demo03;

public class Rect extends Ishape {
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
    public class Body{
        Ishape  Rect1;
        void setIshape(Ishape R) {
            Rect1=R;
        }
        void  showIshape(){
            Rect1.length();
            Rect1.area();
        }
    }
}
