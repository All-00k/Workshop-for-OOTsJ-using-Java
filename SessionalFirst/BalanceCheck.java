package SessionalFirst;
import java.util.Scanner;

public class BalanceCheck {
    public void CheckBalance(double Bal){
        double minBal =1000.0;
        if(Bal>minBal){
            System.out.println("Sufficient Balance");
        }
        else{
            System.out.println("Balance is low ");
        }
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double Balance = in.nextDouble();
        BalanceCheck obj = new BalanceCheck();
        obj.CheckBalance(Balance);
    }

    
}
