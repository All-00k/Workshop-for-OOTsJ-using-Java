public class Constructors {
    int id  ;
    String name;
    int age;
    public Constructors(){
        id = 100;
        name = "aloooookkkk";
        age = 28;
    }
    public Constructors(int i,String n){   //first contructor
        id = i;
        name =n;
    }
    public Constructors(int i, String n,int a){ //second constructor
        id =i;
        name =n;
        age =a;

    }
    void display(){
        System.out.println(id+" "+name+" " + age);
    }
    
    public static void main(String[] args) {
        Constructors obj1 = new Constructors();
        Constructors s1 = new Constructors(111, "Alok");
        Constructors s2 = new Constructors(2,"Ashutosh",18);
        obj1.display();
        s1.display();// to access default constructors,,,,,,,here age will be printed 0 cause we are not giving age
        s2.display();
    }


    }

//so basically the First constructor is called when we give 2 parameters to the constructor
//and the below commstructor is called when we give 3 parameters to the constructor
// what if we remove the constructor with 2 parameters then objectt s1 will show error "Constuctor undefined"


    

