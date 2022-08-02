import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("------------------------SHAPE------------------------");
//        Shape shape = new Shape();
//        System.out.println(shape);
//        shape = new Shape("red", false);
//        System.out.println(shape);
//        System.out.println("------------------------CIRCLE------------------------");
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        circle = new Circle("indigo",false,3.5);
//        System.out.println(circle);
//        System.out.println("------------------------Rectangle------------------------");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//        rectangle = new Rectangle();
//        System.out.println(rectangle);
//        System.out.println("------------------------Square------------------------");
//        Square square = new Square();
//        System.out.println(square);
//        square = new Square(5);
//        System.out.println(square);
        System.out.println("----------------- interface 'Resizeable' ---------------- ");
        Shape [] shape1 = new Shape[3];
        shape1[0] = new Circle("yellow", false, 5);
        shape1[1] = new Rectangle("blue",false,10,5);
        shape1[2] = new Square("green", false,10);
        shape1[0].resize((int)(Math.random()*100));
        System.out.println("Hình tròn sau khi thay đổi: " + shape1[0]);
        shape1[1].resize((int)(Math.random()*100));
        System.out.println("Hình chữ nhất sau khi thay đổi: " + shape1[1]);
        shape1[2].resize((int)(Math.random()*100));
        System.out.println("Hình vuông sau khi thay đổi: " + shape1[2]);

    }
}
