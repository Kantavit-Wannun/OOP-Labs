package lab4.Q3;

public class TriangleTest {
    public static void main(String[] args){
        Triangle t1 = new EquilateralTriangle(60);
        System.out.println(t1.getLongestSideLength());
        System.out.println(t1.getLargestAngle());
        System.out.println(t1.getPerimeter());
        System.out.println();
        Triangle t2 = new RightTriangle(30, 40, 50);
        System.out.println(t2.getLongestSideLength());
        System.out.println(t2.getLargestAngle());
        System.out.println(t2.getPerimeter());
    }
}
