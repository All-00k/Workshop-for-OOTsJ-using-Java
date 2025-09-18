package SessionalFirst;
import java.util.Scanner;
public class NumberPalindrome {
    public int NumberPalindrome(int number){
        String str = String.valueOf(number);
        int first =0;
        int last = str.length() -1;
        while(first<last){
            if(str.charAt(first) != str.charAt(last)){
                return -1; 
            }
            else{
                first++;
                last--;
            }


        }return 0;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        NumberPalindrome obj = new NumberPalindrome();
        if(obj.NumberPalindrome(number) == -1){
            System.out.println("Not Palindrome");
        }
        else{
            System.out.println("Palindrome");
        }

    }
    
    
}


//A class NumberPalindrome with a public method is NumberPalindrome that takes one parameter number of type int.
// Write a code to check whether the given number is palindrome or not. 
// For  example  Cmd  Args  :  333
// 333 is a palindrome

