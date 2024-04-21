package Demo02;

import static java.lang.Math.sqrt;

public class Triangle implements Ishape{
    private int x;
    private int y;
    private int z;
    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void length() {
        System.out.println("三角形的周长为:"+(x+y+z));

    }
    public void area() {
        int  p=(x+y+z)/2;
                System.out.println("三角形的面积为:"+sqrt(p*(p-x)*(p-y)*(p-z)));

    }

}
