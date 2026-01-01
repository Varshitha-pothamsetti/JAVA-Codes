class TwoDimArray {
    public static void main(String[] args){
        int[][] arr={{10,20},{40,50},{70,80}};
        System.out.println(arr[0][0]);
        System.out.println(arr[1][2]);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            System.out.println(arr[i][j]+" ");
        }
        System.out.println();
    }    
  }
}