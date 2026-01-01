class Example-4 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int length_of_array =arr.length;
        System.out.println(length_of_array);
        System.out.println(arr[0]+arr[4]);

        for(int i=0;i < arr.length; i++){
            System.out.println(arr[i] * arr[i]);
        }

        for(int i = arr.length-1 ;i >= 0; i--){
            System.out.println(arr[i] * arr[i] * arr[i]);
        }
    } 
}
