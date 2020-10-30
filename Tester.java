public class Tester {
  public static void main(String[] args) {
    Point bob = new Point(1, 2);
    Point joe = new Point(bob);
    System.out.println(joe.getX());
    System.out.println(joe.getY());
  }
}
