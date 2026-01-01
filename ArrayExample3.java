import java.util.Arrays;
class ArrayExample3 {
    public static void main(String[] args){
        int[] nums={2,5,3,6};
        System.out.println("Before Sorting: "+ Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("After Sorting: " + Arrays.toString(nums));

        String[] names={"satya","varshitha","janu"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(nums));
    } 
}
