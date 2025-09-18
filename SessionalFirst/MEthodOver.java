package SessionalFirst;

public class MEthodOver {
    public static void main(String[] args) {
        Animal A = new Animal();
        Dog D = new Dog();
        Animal C = new Dog();
        A.sound();
        D.sound();
        C.sound(); // as c is the object of Animal class refering to Dog constructor with means  sound() method s overridden 
    }
    
}
class Animal{
    void sound(){
        System.out.println("Animals makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog BArks");
    }

}