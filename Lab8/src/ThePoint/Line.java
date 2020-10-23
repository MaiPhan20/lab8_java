package ThePoint;

public class Line {
    private Point p1;
    private Point p2;

    public Line() {
        p1 = new Point(0, 0);
        p2 = new Point(1, 1);
    }

    public Line(double x1, double y1, double x2, double y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Line(Point p, Point q) {
        p1 = new Point(p.getX(), p.getY());
        p2 = new Point(q.getX(), q.getY());
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP1(double x, double y) {
        Point p1 = new Point(x, y);
        this.p1 = p1;
    }

    public void setP2(double x, double y) {
        Point p2 = new Point(x, y);
        this.p2 = p2;
    }

}
