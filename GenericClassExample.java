class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value= value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
public class GenericClassExample {
    public static void main(String[] args){
        Pair p1 = new Pair("apj", 10);
        System.out.println(p1.getKey());
        Pair p2 = new Pair(10, "apj");
        System.out.println(p2.getKey());
        
    }
} 
