class cat1 {
    String name;
    int age;
    cat1(String n, int a) {
        name = n;
        age = a;
        System.out.println("Hey Bhavya your so cute");
    }
    void printCatDetails(){
        System.out.println("Cat Name is:"+name);
        System.out.println("Cat Age is:"+age);
    }
}
public class Constructor1 {
    public static void main(String[] args){
        cat1 c1 = new cat1("Bhavya",18);
        c1.printCatDetails();
        cat1 c2 = new cat1("Teja",19);
        c2.printCatDetails();
        cat1 c3 = new cat1("Little Monster",20);
        c3.printCatDetails();

    } 
}
