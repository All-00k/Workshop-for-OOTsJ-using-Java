public class AccessVarBySuper {
    public static void main(String[] args) {
        B obj = new B(); //will only make a  object of B because we have to access the method of B and show method will not be in A
        obj.show();
    }

    
}
class A{
    String city = "Kanpur";

}
class B extends A{
   
    String city = "Greater Noida";
    public void show(){
        System.out.println("city: " +super.city); //will print Kanpur
        System.out.println("City: "+city); //will print Greater Noida
    }

}