public class Tester {
  public static void main(String[] args) {
    Point fakeBob = new Point(1, 2);
    Point bob = new Point(fakeBob);
    System.out.println(bob.getX());
    System.out.println(bob.getY());
    Point joe = new Point(5, 5);
    System.out.println(bob.distanceTo(joe));
    System.out.println(bob.equals(joe));
  }
}
