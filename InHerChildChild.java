public class InHerChildChild extends InHerChild {
    public static void main(String[] args) {
        
   
   // InHerChildChild obj = new InHerChildChild();   we dont have to create a object since the Sub() method is static....
    Sub();



    InHerChildChild obj = new InHerChildChild(); // we have to create a object since addition is a non static ....
    obj.addition();
    }
    
}
