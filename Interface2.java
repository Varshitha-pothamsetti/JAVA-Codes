import java.util.Arrays;
interface StringCompare {
    int compare(String s1, String s2); // +value or 0 or -value
}
public class Interface2 {
    public static void bubbleSort(String[] arr, StringCompare com) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(com.compare(arr[j], arr[j + 1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static int vc(String s) {
        int v_c = 0;
        String vowels = "aeiouAEIOU";
        for(char i: s.toCharArray()) {
            if(vowels.contains(""+i)){
                v_c++;
            }
        }
        return v_c;
    }
    public static void main(String[] args){
        String[] arr = {"tokyo", "rio", "nairobi", "professor", "berlin"};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        // sort() function call
        bubbleSort(arr, (a, b) -> a.compareTo(b));
        // sort based on length
        // bubbleSort(arr, (a, b) -> a.length() - b.length())
        bubbleSort(arr, (a, b) -> vc(a) - vc(b));
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
} 
