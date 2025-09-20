import java.io.*;
public class UserDemo2 {
    

    public static void main(String[] args)  throws IOException, Exception //or simpily 'throws Exception'
    {
        int num1, num2, result;
        
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
}

  

