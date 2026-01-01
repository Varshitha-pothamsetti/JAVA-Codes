class Animal {
    void introduce() {
        System.out.println("I am an animal");
    }
}
class Dog extends Animal {
    String breed;
    void introduce() {
        System.out.println("Hello all , I am a dog, I want to be loyal to my owner");
    }
    void fetch(){
        System.out.println("Fetching...");
    }
}
class Cat extends Animal {
    void introduce() {
        System.out.println("Hello all , I am a cat, my owner is not loyal to me");
    }
}

public class AnimalEx {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        ((Dog)d1).fetch();
    }
}
