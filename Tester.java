public class Tester {
  public static void main(String[] args) {
    double[] coords = new double[6];
    for (int i = 0; i < 6; i ++) {
      coords[i] = Double.parseDouble(args[i]);
    }
    Triangle bob = new Triangle(coords[0], coords[1], coords[2], coords[3], coords[4], coords[5]);
    System.out.println("Triangle:");
    System.out.println(bob.toString());
    System.out.println("Perimiter:");
    System.out.println(bob.getPerimeter());
    System.out.println("Area:");
    System.out.println(bob.getArea());
    System.out.println("Type:");
    System.out.println(bob.classify());
    bob.setVertex(2, new Point(21, 87));
    System.out.println("Triangle but now the last point is different:");
    System.out.println(bob.toString());
  }
}
