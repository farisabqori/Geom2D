package polyinterface_new;

public class Test {
    public static void main(String[] args) {
        Geom2D Segitiga = new Triangle(6, 8, 10);

        System.out.println(Segitiga.getArea());
        System.out.println(Segitiga.getPerimeter());
    }
}
