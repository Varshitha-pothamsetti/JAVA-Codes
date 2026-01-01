class Point{
    int x,y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
        
    }
    void showPoint(){
       System.out.println("(" + x + "," + y + ")");
    }
}
class ExampleConstructer1 {
    // Function with own class objects as arguments
    static void printDistance(Point p1,Point p2){
        double distance = Math.sqrt(Math.pow(p2.x - p1.x , 2) + Math.pow(p2.y - p1.y , 2));
        System.out.printf("%.2f",distance);
    }
    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        Point p2 = new Point(7, 8);
        printDistance(p1, p2);
    }
}