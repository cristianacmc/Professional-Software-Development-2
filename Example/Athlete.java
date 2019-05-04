package Example;

import Example.Adult;

/**
 * Created by user on 27/04/2019
 * program to move the array on position to the right
 */
public class Athlete extends Adult {

   final String [] WEEKDAYS = {"Mon  ", "Tues ", "Wed  ", "Thurs", "Fri  "};

   int age;
   int [] weeklyTraining =  new int [5];

   public Athlete () {

      super();
   }

   public Athlete(String pName, int pAge, int [] schedule) {
      super (pName);
      age = pAge;
      weeklyTraining = schedule;
   }

   private String bestDay(){

      //    Examines my training schedule (held in weeklyTraining
      //    Gets the largest value (i.e. the day I trained the most)
      //       and then works out the day that I trained the most!

      int pos = 0;
      int maxHours = weeklyTraining[0];

      for (int pos1 = 1; pos1 < 5; pos1++)
         if (weeklyTraining[pos1] > maxHours) {
            pos = pos1;
            maxHours = weeklyTraining[pos1];
         }
      return WEEKDAYS[pos];
   }

   public void speak (){

      System.out.println("I'm an athlete who trains well on " + bestDay());
   }



   public String toString() {
      String temp = super.toString();
      temp = temp + "\nAge:\t" + age;

      String temp1 = "\n";

      for (int pos = 0; pos <5; pos++) {

         temp1 = temp1 + WEEKDAYS[pos] + "\t";
         temp1 = temp1 + weeklyTraining[pos] + "\n" ;
      }
      temp1 = temp + temp1;
      return temp1;
   }
}//class
