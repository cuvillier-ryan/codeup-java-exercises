package shapes;

public class ShapesTest {
    public static void main(String[] args) {

     Measurable myShape;
     myShape = new Square(5,5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Rectangle(20,10);
        System.out.println(myShape.getArea());




//     Rectangle box1 = new Rectangle(5, 4);
//     Rectangle box2 = new Square(5);

//        System.out.println("The perimeter of box1 is: " + box1.getPerimeter());
//        System.out.println("The area of box1 is: " + box1.getArea());
//
//        System.out.println("The perimeter for box2 is: " + box2.getPerimeter());
//        System.out.println("The area of box2 is: " + box2.getArea());
    }
}
