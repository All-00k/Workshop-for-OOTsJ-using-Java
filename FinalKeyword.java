public class FinalKeyword {
    public static void main(String[] args) {
        
   
    //Child obj = new Child();
    // obj.show();
     }

    
}
final class Parent{
    final void show(){ //it will not be override...
        System.out.println("Called in Parent Class");
    }

}
// class Child extends Parent{  /// parent class will not be inherited..
//     public void show(){
//         System.out.println("Called in Child Class");
//     }
// }
// //if we use final before any variable the value will not be change...
