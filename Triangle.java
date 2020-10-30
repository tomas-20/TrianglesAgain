public class Triangle {
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  private double[] getSides() {
    return new double[] {v1.distanceTo(v2), v2.distanceTo(v3), v3.distanceTo(v1)};
  }
  private double sum(double[] arr) {
    return arr[0] + arr[1] + arr[2];
  }
  public double getPerimeter() {
    return sum(getSides());
  }
  public double getArea() {
    double[] sides = getSides();
    double s = sum(sides) / 2;
    return Math.pow(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]), 0.5);
  }
  private int boolToInt(boolean b) {
    if (b) {
      return 1;
    }
    else {
      return 0;
    }
  }
  public String classify() {
    double[] sides = getSides();
    int sames = boolToInt(sides[0] == sides[1]) + boolToInt(sides[1] == sides[2]) + boolToInt(sides[2] == sides[0]);
    if (sames == 3) {
      return "equilateral";
    }
    else if (sames == 1) {
      return "isosceles";
    }
    else {
      return "scalene";
    }
  }
  public String toString() {
    return "v1" + v1.toString() + " v2" + v2.toString() + " v3" + v3.toString();
  }
}
