import java.util.Scanner;
import java.util.Arrays;
public class RevArray {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[]A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = read.nextInt();
        }
        int[] B = new int[n];
        for (int i=n-1,j=0;i>=0;i--,j++){
            B[j] = A[i];
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
}
