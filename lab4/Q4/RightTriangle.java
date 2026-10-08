package lab4.Q4;

public class RightTriangle implements Triangle {
    protected double side1;
    protected double side2;
    protected double side3;

    public RightTriangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getLongestSideLength(){
        double max = side1;
        if (side2 > max) {
            max = side2;
        }
        if (side3 > max) {
            max = side3;
        }
        return max;
    }
    public double getLargestAngle(){
        return 90.0;
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}
