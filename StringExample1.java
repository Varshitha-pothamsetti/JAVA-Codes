public class StringExample1 {
    public static void main(String[] args){
        String college = "Aditya";
        char[] charArray = college.toCharArray();
        charArray[5] = 'a';
        String x = new String(charArray);
        System.out.println(x);
    }
}
