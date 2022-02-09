package generics.Lab3;

import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable {
  public int compare(GeometricObject o1, GeometricObject o2) {
    return o1.getPerimeter() > o2.getPerimeter() ? 
    	1 : o1.getPerimeter() == o2.getPerimeter() ? 0 : -1;
  }
}