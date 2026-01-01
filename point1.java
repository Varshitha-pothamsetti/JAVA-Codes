class StraightLine {
    point p1,p2;
    StraightLine(point p1, point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    double getLength() {
        return Math.sqrt(Math.pow(p2.x-p1.x,2) + Math.pow(p2.y-p1.y,2));
    }
}
class point {
    int x;
    int y;
    point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
public class point1 {
    public static void main(String[] args) {
        StraightLine s1 = new StraightLine(new point(4,5), new point(7,9));
        System.out.println(s1.getLength());
    }
}
