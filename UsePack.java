import Others.*;
public class UsePack {
    public void mesasge(){
        System.out.println("Message ");


    }
    public static void main(String[] args) {
        NewClass obj = new NewClass();
        obj.show();
        obj.showMessage();
        NewClass2.Show(); //we have not created any object of NewClass cause the method is static

        
    }
    
}
