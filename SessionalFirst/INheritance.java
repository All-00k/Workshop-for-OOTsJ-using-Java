package SessionalFirst;

public class INheritance {
    public static void main(String[] args){
        CAR obj = new CAR();
        obj.fuelType();
        obj.numberOfWheels();
    }

    
}
class Vehiclee{
    void fuelType(){
        System.out.println("Vehicle uses fuel");

    }

}

class CAR extends Vehiclee{
    void numberOfWheels(){
        System.out.println("Car has 4 wheels");
    }
}