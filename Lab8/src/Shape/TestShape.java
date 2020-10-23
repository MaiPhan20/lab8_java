package Shape;

public class TestShape {
    public static void main(String[] args) {
        Circle objCircle = new Circle(2.3);
        System.out.println(objCircle.getArea());
        System.out.println(objCircle.getPerimeter());

        Rectangle objRectangle = new Rectangle(1.5,4.5);
        System.out.println(objRectangle);

        Square objSquare=new Square(6,"red",false);
        objSquare.setSide(2);
        System.out.println(objSquare.getSide());
        objSquare.setWidth(1);
        System.out.println(objSquare.getWidth());
        System.out.println(objSquare.getLength());
        System.out.println(objSquare);

    }

}
