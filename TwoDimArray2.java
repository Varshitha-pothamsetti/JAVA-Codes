import java.util.Scanner;
public class TwoDimArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] =new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
                System.out.println(mat[i][j] * mat[i][j] + " ");
            }
            System.out.println();
        }        
    }
} 
