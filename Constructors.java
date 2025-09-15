public class Constructors {
    int id  ;
    String name;
    int age;
    public Constructors(int i,String n){
        id = i;
        name =n;
    }
    public Constructors(int i, String n,int a){
        id =i;
        name =n;
        age =a;

    }
    void display(){
        System.out.println(id+" "+name+" " + age);
    }
    
    public static void main(String[] args) {
        
        Constructors s1 = new Constructors(111, "Alok");
        Constructors s2 = new Constructors(2,"Ashutosh",18);
        s1.display();
        s2.display();
    }


    }

    

