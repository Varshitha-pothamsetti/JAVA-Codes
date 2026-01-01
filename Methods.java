class Rectangle {
    int length;
    int width;

    void CalculateAndPrintArea() {
        System.out.println(length * width);
    }

    void ClaculateAndPrintPerimeter() {
        System.out.println(2 * (length + width));
    }
}

public class Methods {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 21;
        r1.width = 12;
        r1.CalculateAndPrintArea();
        r1.ClaculateAndPrintPerimeter();
        Rectangle r2 = new Rectangle();
        r2.length = 4;
        r2.width = 6;
        r2.CalculateAndPrintArea();
        r2.ClaculateAndPrintPerimeter();
     r1.ClaculateAndPrintPerimeter();
    }
}