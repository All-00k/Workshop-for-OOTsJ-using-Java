public class ProgramSec {
    public static void main(String[] args) {
        Childs obj = new Childs();
        // Childs obj1 = new Childs(1);    
    }
    
}
class Parents{
    public Parents(int a){
        System.out.println("Parent Para Const: "+a);
    }
    public Parents(){
        System.out.println("Default Parent Const");

    }
}
class Childs extends Parents{
    
    public Childs(){
        // super(1);
        System.out.println("Default Childs Constructor");
    }
    // public Childs(int a){
    //     System.out.println("Param Child const: "+a);
    // }
}