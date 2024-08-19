public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3, 5);
        shapes[2] = new Square(5);


        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle || shapes[i] instanceof Rectangle || shapes[i] instanceof Square) {

                System.out.println(+shapes[i].getArea());
                System.out.println(+shapes[i].getPerimeter());

                if (shapes[i] instanceof Colorable){
                    System.out.println(((Colorable) shapes[i]).howToColor());
                }
            }
        }
    }
}
