public class TriangleTest {
    public static void main(String[] args) {
        Point2D A = new Point2D(1,1);
        Point2D B = new Point2D(3,4);
        Point2D C = new Point2D(6,1);
        Triangle triangle = new Triangle(A, B, C);
        System.out.println("area: " + triangle.area());
        System.out.println("perimeter: " + triangle.perimeter());
        Point2D medianPoint = triangle.medianIntersectionPoint();
        System.out.println(String.format("Median intersection point (%,.2f,%,.2f)", medianPoint.getX(), medianPoint.getY()));
    }
}