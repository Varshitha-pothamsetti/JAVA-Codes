public class Interface3 {
    public static <T> void printArray(T[] arr) {
        for(T eachValue: arr) {
            System.out.println(eachValue);
        }   
    }
    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        printArray(intArray);
        Double[] doubleArray = {45.6, 77.9, 107.4};
        printArray(doubleArray);
        String[] stringArray = {"ab", "cd", "ri", "tu"};
        printArray(stringArray);
    }
}
