//import java.lang.reflect.Array;
import java.util.Arrays;
class ArrayExample5 {
  public static void main(String[] args){
    int[] a={10,20,30};
    int [] b=a.clone();
    a[0]=100;
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
  }  
}
