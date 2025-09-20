import java.util.Scanner;
public class StringMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(name.substring(0,6));
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(" :This is your name"));
        System.out.println(name.equals("alok Singh Yadav"));
        System.out.println(name.replaceAll(name,"ALok"));
        System.out.println(name.matches("alok Singh Yadav"));
        
    
    
}
}
