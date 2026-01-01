import java.util.Arrays;
public class ArraycharExample {
    public static void main(String[] args){
        int[] A={10,20};
        int[] B={10,46,2};
         //boolean result =Arrays.equals(A,B);
         System.out.println(Arrays.compare(A,B));
         System.out.println(Arrays.mismatch(A,B));


         char[] c1={'a','b','c'};
         char[] c2={'z','x','y'};
         System.out.println(Arrays.compare(c1,c2));
         System.out.println(Arrays.mismatch(c1,c2));


    } 
}

