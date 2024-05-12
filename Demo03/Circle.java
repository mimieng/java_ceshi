package Demo03;

public class Circle extends Ishape{
     private double r;
     double Ti=3.14;
     public Circle (double r){
         this.r=r;
     }

    public void length() {
        System.out.println("圆的周长为:"+(2*Ti*r));
    }


    public void area() {
        System.out.println("圆的面积为:"+(Ti*r*r));

    }

         }
         class Body{
             Ishape  Circle1;
             void setIshape( Ishape c) {
                 Circle1=c;
             }
             void showIshape(){
                 Circle1.length();
                 Circle1.area();
    }
}
