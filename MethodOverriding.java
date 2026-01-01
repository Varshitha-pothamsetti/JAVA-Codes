class bank {
    String name;
    int numberOfCustomers;
     double getIntrest(){
        return 0.0;
    }
}
class SBI extends bank {
     double getIntrest() {
        return 7.5;
    }
}
class Canara extends bank{
    double getIntrest() {
        return 8.5;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Canara bank1 = new Canara();
        System.out.println(bank1.getIntrest());
        SBI bank2 = new SBI();
        System.out.println(bank2.getIntrest());
    }
}
