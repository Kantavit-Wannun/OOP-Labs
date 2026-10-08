package lab4.Q4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TriangleManager {
    protected List<Triangle> triangles;

    public TriangleManager(boolean useArrayList){
        if (useArrayList) {
            this.triangles = new ArrayList<>();
        } else {
            this.triangles = new LinkedList<>();
        }
    }
    
    public void addTriangle(Triangle t){
        if (t == null) {
            throw new IllegalArgumentException("Triangle cannot be null");
        }
        triangles.add(t);
    }
    public Triangle findTriangleWithLargestPerimeter(){
        if (triangles.isEmpty()) {
            return null;
        }
        
        Triangle maxTriangle = triangles.get(0);
        double maxPerimeter = maxTriangle.getPerimeter();

        for (int i=1; i<triangles.size();i++) {
            Triangle current = triangles.get(i);
            double currentPerimeter = current.getPerimeter();
            
            if (currentPerimeter > maxPerimeter) {
                maxPerimeter = currentPerimeter;
                maxTriangle = current;
            }
        }
        return maxTriangle;
    }
}
