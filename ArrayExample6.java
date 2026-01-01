import java.util.Arrays;
class ArrayExample6{
    static void change(int[] a){
        a[0]=1000;
    }
    public static void main(String[] args){
        int [] a={10,20,30,40};
        System.out.println("Before changing:" + Arrays.toString(a));
        change(a);
        System.out.println("After changing:" + Arrays.toString(a));
    
    
    }
}