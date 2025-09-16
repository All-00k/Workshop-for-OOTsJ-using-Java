
public class Shape {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        
        System.out.println("Area of circle :" + obj1.Area(9, 19));
        System.out.println("Perimeter of Rectangle : " + obj1.Perimeter(9,19));


        Circle obj2 = new Circle();
        System.out.println("Area of Circle " + obj2.Area(4));
        System.out.println("Perimeter of Circle : " + obj2.Perimeter(4));    
    }    
}
class Rectangle{
    public int Area(int l,int b){
        return l * b;

    }
    public int Perimeter(int l, int b){
        return 2*(l+b) ;
    }
}

class Circle{
    public double Area(int r){
        return r*r;

    }
    public double Perimeter(int r){
        return 2 * Math.PI *r ;
    }
}
  



