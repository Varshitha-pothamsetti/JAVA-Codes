import java.util.Arrays;
public class SortingAnArray{
    public static void main(String[] args){
        int [] a ={7,-1,22,6,8};
        System.out.println("Before Sorting:"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting:"+Arrays.toString(a));
        
    }
}