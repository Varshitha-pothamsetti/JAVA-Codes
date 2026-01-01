class cat2{
    String name;
    int age;
    cat2(){}
    cat2(String n){
        name = n;
    }
    cat2(String n, int a){
        name = n;
        age = a;
    }
    void printCatDetails(){
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);

    }
}
public class Constructor2 {
    public static void main(String[] args){
        cat2 c1 = new cat2("Bhavya",18);
        c1.printCatDetails();
        cat2 c2 = new cat2("Satya",20);
        c2.printCatDetails();
    }   
}
