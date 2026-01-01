import java.util.Arrays;
class ArrayExample8 {
    public static void main(String[] args){
        int[][] a = new int[3][];
        a[0] = new int[10];
        a[1] = new int[20];
        a[2] = new int[1];
        for(int i = 0; i < 10; i++){
            a[0][i] = i*i;
        }
        System.out.println(Arrays.deepToString(a));
    }    
}
