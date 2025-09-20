import java.io.*;
public class UserDemo {
    public static void main(String[] args) {
        int num1, num2, result;
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // InputStream isr = new InputStream(System.in);
            // BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter first number: ");
            num1 = Integer.parseInt(br.readLine());
            System.out.println("Enter second number: ");
            num2 = Integer.parseInt(br.readLine());
            result= num1 + num2;
            System.out.println("Sum: "+result);
                
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
                
            
        }
    }

//checked exception (compile time exception)
    // if we remove the try statement and catch statement then this will show error as "Unsolved Compilation Problem"

