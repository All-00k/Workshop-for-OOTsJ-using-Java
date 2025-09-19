public class TakeInputFromArgs {
    public static void main(String[] args) {
        
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1])); 
        //by default command line take string arguments to convert in into integer we have to do "Integer.parseInt(args[0])"
    }
    
}
