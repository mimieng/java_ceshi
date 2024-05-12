package Demo03;



public class Test {
    public static void main(String[]  args){
        Ishape shape =new Circle(4);
        Body body=new Body();
        body.setIshape(shape);
        body.showIshape();
        shape =new Rect(4,5);
        body.setIshape(shape);
        body.showIshape();
        shape =new Triangle(3,4,5);
        body.setIshape(shape);
        body.showIshape();


    }
}
