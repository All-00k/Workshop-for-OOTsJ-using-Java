import java.util.Scanner;


class Calculator {
    int num1, num2, result;
    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void divide(){
        try{
            if (num1>num2){
                result = num1 / num2;
                System.out.println(result);
            }
            else{
                result = num2/num1;
                System.out.println(result);
            }
        }
        catch(ArithmeticException ar){
            System.out.println(ar.toString());
        }  // if we this whole catch block below of catch block of Exception then it will show error that
            //exception is already handled....
        
        catch(Exception e){
            System.out.println("Error");
            System.out.println(e.toString());
            e.printStackTrace(); //to track the error
        }
        
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.print("N1: ");
        n1 = sc.nextInt();
        System.out.print("N2: ");
        n2 = sc.nextInt();
        Calculator obj = new Calculator(n1, n2);
        obj.divide();
        
    }
}







// try{
//     }
//except(Exception class obj name)