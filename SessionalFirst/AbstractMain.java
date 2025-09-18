package SessionalFirst;

abstract class Animals {
    abstract void sound();

    
    
}
class Cat extends Animals{
    void sound(){
        System.out.println("CAt MEOWS ");
    }
}

public class AbstractMain{
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }
}
