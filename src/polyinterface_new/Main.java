package polyinterface_new;

public class Main{
    public static void main(String[] args) {
//        Geom2D Segitiga = new Triangle(6, 8, 10);
//
//        System.out.println(Segitiga.getArea());
//        System.out.println(Segitiga.getPerimeter());
//        Segitiga.drawIllustration();

        Geom2D Trapesium = new Trapezoid(16, 10, 4, 5);

        System.out.println(Trapesium.getArea());
        System.out.println(Trapesium.getPerimeter());
        Trapesium.drawIllustration();


    }
}
