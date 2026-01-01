import java.util.Arrays;
class ArrayExample2 {
    public static void main(String[] args){
        int a[]= new int[5];
        Arrays.fill(a , -1);
        System.out.println(Arrays.toString(a));

        String[] names= new String[10];
        Arrays.fill(names,"SATYA");
        System.out.println(Arrays.toString(names));

        char[] characters=new char[10];
        Arrays.fill(characters,2,5,'a');
        System.out.println(Arrays.toString(characters));
        Arrays.fill(characters,5,10,'s');
        System.out.println(Arrays.toString(characters));

        //boolean boolArray[]=new boolean[100];
        //Arrays.fill(boolArray,val:true);
        //System.out.println(Arrays.toString(boolArray));
    }
    
}
