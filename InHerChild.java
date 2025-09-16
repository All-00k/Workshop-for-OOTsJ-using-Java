public class InHerChild extends Inher {
    public void show(){
        System.out.println("Showing  InHerChild");

    }
    public static void Sub(){
        int num1 =10;
        int num2 =20;
        int subtraction = num2-num1;
        System.out.println("Subtracion: "+subtraction);
    }
    public static void main(String[] args) {
    InHerChild obj = new InHerChild();
    obj.display();
    obj.addition();
    obj.show();

    }


    
}
