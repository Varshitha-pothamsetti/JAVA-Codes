public class StringExample4 {
    static String concatFirstChars(String ... strings){
        String resultString = "";
        for(int i=0; i<strings.length;i++){
            resultString += strings[i].charAt(0); //resultString += eachString.chaAt(0);
        }
        return resultString;
    }
    public static void main(String[] args){
        System.out.println(concatFirstChars("abc" ,"def"));
        System.out.println(concatFirstChars("ab","cd","ef","gh","ij"));

    }
}
