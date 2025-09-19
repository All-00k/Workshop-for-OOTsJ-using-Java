import java.util.Scanner;
import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        
    int total=0 ;
    int[] marks = new int[5];
    System.out.println("Array elements: ");

    Scanner sc = new Scanner(System.in);
    for(int i=0;i<marks.length;i++){
        // System.out.print("marks["+i+"] :");
        System.out.printf("marks[%d]: ",i);
        marks[i]= sc.nextInt();

    }
    
    

    for(int j =0; j<marks.length;j++){
        total   += marks[j];
        System.out.print(marks[j]+" ");

    }
    System.out.println("Total: "+total);
}
}

    
        
    


    

