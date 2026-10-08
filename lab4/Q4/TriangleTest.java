package lab4.Q4;

public class TriangleTest {
    public static void main(String[] args){
        TriangleManager triangle = new TriangleManager(true);
    
        Triangle t1 = new EquilateralTriangle(60);
        Triangle t2 = new RightTriangle(30, 40, 50);
        Triangle t3 = new EquilateralTriangle(90);

        triangle.addTriangle(t1);
        triangle.addTriangle(t2);
        triangle.addTriangle(t3);

        Triangle largest = triangle.findTriangleWithLargestPerimeter();
        System.out.println("Largest Perimeter: " + largest.getPerimeter());

        try {
            triangle.addTriangle(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
