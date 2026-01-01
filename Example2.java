import java.util.Scanner;
class Example{
public static void main(String[] args){
int a,b,c;
Scanner read=new Scanner(System.in);
a=read.nextInt();
b=read.nextInt();
c=a+b;
System.out.println(" Sum of "+ a +" and " + b +" is " + c);
System.out.printf("Sum of %d and %d is: %d\n ",a,b,c);
System.out.println(a+" " + b + " "+ c);

}
}