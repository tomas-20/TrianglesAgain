public class Tester {
  public static void main(String[] args) {
    double[] points = new double[6];
    for (int i = 0; i < 6; i ++) {
      points[i] = Double.parseDouble(args[i]);
    }
    Triangle bob = new Triangle(points[0], points[1], points[2], points[3], points[4], points[5]);
    System.out.println("Perimiter:");
    System.out.println(bob.getPerimeter());
    System.out.println("Area:");
    System.out.println(bob.getArea());
  }
}
