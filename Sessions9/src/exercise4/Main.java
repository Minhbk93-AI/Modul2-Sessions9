package exercise4;

public class Main {
    public static void main(String[] args) {
        Shape rectangle= new Rectangle();
        Shape circle= new Circle();

        System.out.println("Diện tích hình chữ nhât là: "+rectangle.getArea());
        System.out.println("Diện tích hình tròn là: "+circle.getArea());
    }
}
