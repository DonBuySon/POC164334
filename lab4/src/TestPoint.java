import java.awt.*;

public class TestPoint {
    public static void main(String[] args) {
        Point a1 = new Point();
        Point b1 = new Point();
        a1.x = 2;
        a1.y = 7;
        b1.x = 5;
        b1.y = 8;
        System.out.println(a1.distance(b1));
    }
}

class Point{
    double x;
    double y;

    double distance(Point otherPoint) {
        return Math.sqrt((this.x - otherPoint.x) * (this.x - otherPoint.x) + (this.y - otherPoint.y) * (this.y - otherPoint.y));
    }
}