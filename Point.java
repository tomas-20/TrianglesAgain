public class Point {
  private double x, y;
  public Point(double X, double Y) {
    x = X;
    y = Y;
  }
  public Point(Point p) {
    x = p.x;
    y = p.y;
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  private double square(double n) {
    return n * n;
  }
  public double distanceTo(Point other) {
    return Math.pow(square(x - other.x) + square(y - other.y), 0.5);
  }
  public boolean equals(Point other) {
    return x == other.x && y == other.y;
  }
  public String toString() {
    return "(" + Double.toString(x) + ", " + Double.toString(y) + ")";
  }
}
