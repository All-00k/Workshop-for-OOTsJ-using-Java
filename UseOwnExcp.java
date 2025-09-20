import java.io.*;
class OwnException extends Exception {
   public OwnException(String text){
    super(text);
   }
}
public class UseOwnExcp{
   public void Inuput(int n) throws OwnException{
      if(n<0){
         throw new OwnException("Less than zero");
      }
      

   }
   public static void main(String[] args) {
      UseOwnExcp obj =  new UseOwnExcp();
      try{
      obj.Inuput(-1);
      }
      catch(OwnException es){
         System.out.println(es.toString());
      }
   }

}