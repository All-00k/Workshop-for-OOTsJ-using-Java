interface hello {
    void print();
}
class Hi implements hello{
    public void print(){
        System.out.println("HEllo");
    }
    public static void main(String[] args) {
        Hi obj = new Hi();
        obj.print();
    }
}

//interface can have only abstract methods. Since Java 8, it can have default and static methods
//interafce is a type of abstract class which can implements multiple sub classes ("multiple inheritance")
  



    

