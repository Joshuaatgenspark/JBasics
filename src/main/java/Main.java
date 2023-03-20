public class Main {
    public static void main(String[] args) {
        //super class
        Animal a1 = new Animal();
        a1.sound();
        //method overloading
        a1.sound("bark");
        //subclass
        Cat cat = new Cat();
        //method overriding
        cat.sound();
    }
}
