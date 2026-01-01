@FunctionalInterface 
interface MathOperations {
    int operate(int a, int b);
}
class Interference {
    public static void main(String[] args){
        MathOperations c1 = (a, b) -> a+b; // Atonymous implememntation of interference
                                           // Also called lambda in java
                                           // Here actually a class will be 
                                           //created, but it's internally handled
                                           // java
        System.out.println(c1.operate(10, 20));
    }    
}
