package InterfaceProgram;

interface InnerAwsd {
    public void show();
   
}
 interface InnerAwsd_1 {

    public void sum();

    
}
class A_class{
    public void greet(){
        System.out.println("NiHao");
    }
}
public class Awsd extends A_class implements InnerAwsd ,InnerAwsd_1 {
    public void show(){
        System.out.println("This is show method Overriding from Interface InnerAwsd");
    }
    public void sum(){
        System.out.println("This is sum method Overriding from Interface InnerAwsd_1");
        
    }
    public void greet(){
        super.greet();
        System.out.println("Child class: Ni hao");

    }
    public static void main(String[] args) {
        Awsd obj = new Awsd();
        obj.show();
        obj.sum();
        obj.greet();

    }

    

    
    
}
