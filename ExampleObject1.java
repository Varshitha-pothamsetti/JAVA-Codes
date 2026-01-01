class Dog {
    String name;
    int age;
    void setNameAndAge(String s, int a){
    name = s;
    age = a;
}
public String toString(){
    return "Dog("+ name +" , "+ age + ")";
    }
}
class ExampleObject1 {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.setNameAndAge("CHINNU",18);
        System.out.println(d1);
    }
}
