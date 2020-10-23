package ThePoint;

public class Point {
    private double x;
    private double y;

    public Point()
    {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double distance(Point p)
    {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y)
                * (this.y - p.y));
    }

    public String toString()
    {
        String s = "(" + x + ", " + y + ")";
        return s;
    }

    public boolean equals(Point p)
    {
        double delta = 1.0e-18;
        return (Math.abs(this.x - p.x) < delta)
                && (Math.abs(this.y - p.y) < delta);
    }

}
