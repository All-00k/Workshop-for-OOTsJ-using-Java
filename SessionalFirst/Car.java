package SessionalFirst;

public class Car {
    String model ;
    int speed ;

    void display(){
        System.out.println("CAr Model:" + model);
        System.out.println("CAr speed: "+speed +" m/s");
    }

    public static void main(String[] args){
        Car obj = new Car();
        obj.model = "MAAARUTIIII ALTO";
        obj.speed = 100;
        obj.display();
    }
    
}
