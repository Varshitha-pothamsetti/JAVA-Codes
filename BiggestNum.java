import java.util.Scanner;
class BiggestNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2){
            System.out.println(n1+" is bigger than "+n2);
        }
        else{
            System.out.println(n2+" is bigger than "+n2);
        }
    }
}