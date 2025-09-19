import Others.*;
import Others.OtherInOther.*;
import java.util.*;

public class UsePack {
    public void mesasge(){
        System.out.println("Message ");


    }
    public static void main(String[] args) {
        NewClass obj = new NewClass();
        obj.show();
        obj.showMessage();
        NewClass2.Show(); //we have not created any object of NewClass cause the method is static
        Packing obj1 = new Packing(); //accessing method of file(Packing) exists in "OtherInOther"
        obj1.greeting();

        Date date = new Date();
        System.out.println((date.toString()));

        
    }
    
}
