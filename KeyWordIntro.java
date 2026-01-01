class point1 {
    int x, y;
    void printThisObject(){
        System.out.println(this);
    }
}
class KeyWordIntro {
    public static  void main(String[] args){
        point1 p1 = new point1();
        System.out.println(p1);
        p1.printThisObject();
    }
}
