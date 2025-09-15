abstract class AbstractClass {
    //Abstract method (does not have a body)
    abstract void run();
}
class Honda4 extends AbstractClass{
    void run(){
        System.out.println("Running safely....");
    }
    public static void main(String[] args) {
        AbstractClass obj = new Honda4();
        obj.run();
    }
} 


//The purpose of an abstract class is to act as a blueprint for subclasses, not to be run on its own.
//AbstractClass .class file will not run but Honda4 class file woll run by jvm.
//we can not form a object of Abstract Class,Helps enforce rules on child classes.
//An abstract class is meant to provide:
    ///Abstract methods (without implementation) that force subclasses to implement them.
    /// 
    /// 
    //Common behavior (concrete methods) that can be shared.
//But to run code, you need to:
    //Implement a concrete subclass.
    //Have a class with a main() method, usually in the subclass or a separate class.
        

