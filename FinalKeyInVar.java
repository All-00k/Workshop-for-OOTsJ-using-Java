public class FinalKeyInVar {
    public static void main(String[] args) {
        FinalVar obj = new FinalVar();
        obj.display();
    }
   

    
}
 class FinalVar{
    final float PI = 3.14f;
    int a =15;
    public void display(){
        System.out.println("PI = "+PI);
        System.out.println("A: "+a);
        a=90;
        System.out.println("A: "+a);
        //PI = 2.1f; //show error: final field FinalVAr.PI cant be re assigned
        System.out.println("PI:" + PI);
        
    }
    
}
