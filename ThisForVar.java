public class ThisForVar {
    int a=5;
    public void display(){
        a=10;
        
        System.out.println("A: "+ this.a); 
      
        System.out.println("A: "+ a);
    }
    public static void main(String[] args){
        ThisForVar obj = new ThisForVar();
        obj.display();
    }

    
}

