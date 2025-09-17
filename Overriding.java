 public class Overriding {
    public static void main(String[] args) {
        Parentt object = new Parentt();
        object.display(5,6);
        object.show();
        Parentt object1 = new Childd();
        object1.display(5,6);
        object1.show();
        
    }
    
}
class Parentt{
    public  void display(int a, int b){
        
        int c =a+b;
        System.out.println("c: " +c);
    }
    public void show(){
        System.out.println("In PArent class");

    }
}
class Childd extends Parentt{
    @Override
    public  void display(int a, int b){
        super.display(a, b);
        int c = a*b;
        
        System.out.println("c: "+c);
    }
    public void show(){
        super.show();
        System.out.println("In Child Class");
    }
}
        
// output of display with object1 will be 30 i.e. a*b which means the method of child is called in case of overriding a method.. construcutor of child is called with the reference object of parent class 


