package Example;

/**
 * Created by user on 27/04/2019
 * COMMENTS ON THE PROGRAM GO HERE
 */
abstract public class Adult {

   protected String name;

   public Adult(){
   }

   public Adult(String pName) {

      name = pName;
   }

   abstract public void speak();

   public String toString() {
      return "My name is " + name;
   }
}//class
