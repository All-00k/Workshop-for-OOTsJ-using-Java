import java.util.Scanner;
public class ArrayDemo2 {
    public static void main(String[] args) {
        
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
        
        System.out.printf("arr[%d]: ",i);
        arr[i]= sc.nextInt();

    }
    for(int j=0;j<arr.length;j++){
        
        
        System.out.println(arr[j] + " ");

    }

    for(int p =0; p<arr.length ;p++){
    switch(arr[p]){
        case 1:
        System.out.println("Sunday");
        break;
        case 2:
        System.out.println("Monday");
         break;
        case 3:
        System.out.println("Tuesday");
         break;
        case 4:
        System.out.println("Wednesday");
         break;
        case 5:
        System.out.println("Thursday");
         break;
        case 6:
        System.out.println("Friday");
        break;
        case 7:
        System.out.println("Saturday");
        break;
        default:
         System.out.println("There is no "+ arr[p]+ "th day in a week");


    }
    }

    }
}
    
