public class Triangle {
    private Point2D A;
    private Point2D B;
    private Point2D C;

    private double a;
    private double b;
    private double c;

    private double lineLength(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public Triangle(Point2D A, Point2D B, Point2D C) {
        this.A = A;
        this.B = B;
        this.C = C;
        a = lineLength(B, C);
        b = lineLength(A, C);
        c = lineLength(A, B);
    }

    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return a + b + c;
    }

    public Point2D medianIntersectionPoint() {
        return new Point2D((A.getX() + B.getX() + C.getX()) / 3,
                (A.getY() + B.getY() + C.getY()) / 3);
    }
}