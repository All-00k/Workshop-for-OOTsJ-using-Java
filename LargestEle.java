import java.util.Scanner;
import java.util.Arrays;
public class LargestEle {
    

    public static void main(String[] args) {
        int n;
        System.out.println("enter n:");
        Scanner sc = new Scanner(System.in);
        
        
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
        
        System.out.printf("arr[%d]: ",i);
        arr[i]= sc.nextInt();
        }
        
        int Largee = largest(arr);
        System.out.println("Largest: "+Largee);

        int Shortt = smallest(arr);
        System.out.println("Smallest: "+Shortt);

        int[] soortt = BubbleSort(arr);
        System.out.println("Sorted: "+Arrays.toString(soortt));




    
   
}  

public static int  largest(int[] arr){
    int large =arr[0];
    for(int i=0;i<arr.length;i++){
        if(large > arr[i]){
            large=arr[i];
            
        }
    }return large;

}

public static int  smallest(int[] arr){
    int small =arr[0];
    for(int i=0;i<arr.length;i++){
        if(small < arr[i]){
            small=arr[i];
            
        }
    }return small;

}

public static int[] BubbleSort(int[] arr){
    for(int i =0; i<arr.length ;i++){
        boolean swapped =false;
        for(int j=0 ;j <arr.length ;j++){
            if(arr[j]>arr[j+1]){
                swap(j,j-1,arr);
                swapped = true;
            }
            if (!swapped){
                break;
            }
        }
    }return arr;

}


public static void swap(int f, int l, int[] arr){
    int temp = arr[f];
    arr[f] = arr[l];
    arr[l]=temp;
}


}