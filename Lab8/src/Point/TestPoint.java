package Point;

public class TestPoint {
    public static void main(String[] args) {
        Point2D pnt = new Point2D(4,6);
        System.out.println(pnt.getXY()[1]);

        Point3D obj = new Point3D(3,4,3);
        System.out.println(obj.getXYZ()[0]);
        System.out.println(obj.getXYZ()[1]);
        System.out.println(obj.getXYZ()[2]);
    }
}
