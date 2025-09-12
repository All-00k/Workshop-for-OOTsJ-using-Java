
public class Marks {
    public static void main(String[] args) {
        OfMarks obj1 = new  OfMarks();
        System.out.println("Sum: " + obj1.Sum(100, 56, 68));
        System.out.println("Average:" + obj1.Average(100, 56, 80));
        
    }
    
}

class OfMarks{

    public int Sum(int M1,int M2,int M3){
        return M1+M2+M3;

    }

    public double Average(int M1,int M2,int M3){
        return (M1+M2+M3) / 3;

    }
    
}
