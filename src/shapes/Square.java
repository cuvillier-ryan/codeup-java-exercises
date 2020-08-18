package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }
    public void setLength(int side){
        super.length = side;
        super.width = side;
    }
    public double getPerimeter(){
        return 4 * super.length;
    }
    public double getArea(){
        return Math.pow(super.length, 2);
    }
}

