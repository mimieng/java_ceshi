package Demo02;

public class Test {
    public static void main(String[] args){
        Circle circle = new  Circle(4);
        circle.length();
        circle.area();
        Rect rect =new Rect(5,6);
        rect.length();
        rect.area();
        Triangle triangle =new Triangle(3,4,5);
        triangle.length();
        triangle.area();
    }
}
