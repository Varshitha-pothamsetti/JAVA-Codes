class OutOfBounds1 {
   public static void main(String[] args) {
    int[] arr = {10, 20, 50};
    try {
        System.out.println(arr[9]);
    }
    catch(ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
        System.out.println(e.getMessage());
    }
   } 
}
