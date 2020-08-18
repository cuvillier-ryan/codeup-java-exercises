package shapes;

public class Square extends Quadrilateral {
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
    this.length = length;
    }

    @Override
    public void setWidth(double width) {
    this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}




//
//    public Square(int side) {
//        super(side, side);
//    }
//}
//    public void setLength(int side){
//        this.length = side;
//        this.width = side;
//    }
//    public double getPerimeter(){
//        return 4 * this.length;
//    }
//    public double getArea(){
//        return Math.pow(this.length, 2);
//    }
//}

