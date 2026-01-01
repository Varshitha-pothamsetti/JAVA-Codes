import java.util.Scanner;
class Arrays {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        //default values
        //int,short,byte-->0
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        int min=A[0];
        for(int i=1; i<n; i++){
            if(A[i]<min) min=A[i];
        }
            System.out.println(min);
    }
    
}
