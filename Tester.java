public class Tester {
  public static void main(String[] args) {
    Point fakeBob = new Point(1, 2);
    Point bob = new Point(fakeBob);
    System.out.println(bob.getX());
    System.out.println(bob.getY());
    Point joe = new Point(5, 5);
    System.out.println(bob.distanceTo(joe));
    System.out.println(bob.equals(joe));
    Point dylan = new Point(8, 9);
    Triangle pythagoras = new Triangle(bob, dylan, joe);
    Triangle euclid = new Triangle(2, 1, 8, 7, 4, 2);
    System.out.println(euclid.getPerimeter());
    System.out.println(euclid.getArea());
  }
}
