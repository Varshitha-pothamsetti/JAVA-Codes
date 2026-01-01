import java.util.Scanner;
class TwoDimArray {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int r,c;
        r=read.nextInt();
        c=read.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<c;i++){
            for(int j=0;i<c;j++){
                mat[i][j]=read.nextInt();
            }
        }
        Array.deepToString(mat);
    }
}
