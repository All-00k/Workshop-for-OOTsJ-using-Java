public class Program {
    public static void main(String[] args) {
        Childdd obj = new Childdd();
        
    }
    
}
class Parenttt{
    public Parenttt(){
        System.out.println("Parent Default Const");
    }
}
class Childdd extends Parenttt{
    public Childdd(){
        System.out.println("Child Default Constr");
    }
}
