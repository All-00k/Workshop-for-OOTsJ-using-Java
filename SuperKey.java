public class SuperKey {
    public static void main(String[] args) {
        Employee obj = new Employee(1, "alok", "28-sept");
        obj.display();
    }    
}

class Student{
    
    String name,dob;
    public Student(String name, String dob){
        this.name = name;
        this.dob= dob;
    }
}

class Employee extends Student{
    int id;
    public Employee(int id, String name, String dob){
        super(name,dob);   //to access name,obj form parent class's constructor or method
        this.id = id;
    }
    public void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+ name);
        System.out.println("DOB: "+dob);
    }

}
