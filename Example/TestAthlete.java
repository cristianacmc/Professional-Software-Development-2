package Example;

import Example.Athlete;

/**
 * Created by user on 27/04/2019
 * COMMENTS ON THE PROGRAM GO HERE
 */
public class TestAthlete {
   public static void main(String[] args) {

      int [] mySchedule = {5, 3, 4, 3, 2};
      Athlete me = new Athlete("Martin", 40, mySchedule);
      System.out.println(me);
      me.speak();
   }//main
}//class
