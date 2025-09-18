package SessionalFirst;

public class FibonaciSeries {
//     Write a class Fibonacci Series with a main method. The method receives one command line argument. 
//Write a program to display fibonacci series i.e. 0 1 1 2 3 5 8 13 21
// #Write a Java Program to find the Factorial of a given number.
public static void main(String[] args){
    
    int n = Integer.parseInt(args[0]);
    int first =0;
    int second =1;
    for(int i=0;i<n;i++){
        System.out.print(first+" ");

        int temp = first +second;
        first =second;
        second = temp;
    }
    System.out.println(" ");
    int fac =1;
    for(int i=n;i>0;i--){
        fac = fac *i;

    }
    
    
    System.out.println(fac);

}


    
}
