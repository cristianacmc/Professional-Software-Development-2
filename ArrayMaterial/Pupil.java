package ArrayMaterial;

/**
 * Created by Cristiana Costa
 * on 2019-05-01
 * Program to create an array of 6 Pupil objects
 */

public class Pupil {

    // instance variables
    protected String name;
    protected int mark1, mark2, mark3;
    protected double average = 0;
    private static int numberPupils = 0;

    // constructor methods
    public Pupil(){
        numberPupils++;
    }

    public Pupil(int pMark1, int pMark2, int pMark3) {

        numberPupils++;
        mark1 = pMark1;
        mark2 = pMark2;
        mark3 = pMark3;

        average = (pMark1 + pMark2 + pMark3) / 3;
    }

    // getters


    // setteres

    protected void setName(String customName){
        name = customName;
    }

    protected void setMark1(int customMark1){
        mark1 = customMark1;
    }

    protected void setMark2(int customMark2){
        mark2 = customMark2;
    }

    protected void setMark3(int customMark3){
        mark3 = customMark3;
    }

    /*public String toString(){
        String temp = "";
         temp += "Student: \" + this.name + ", \n";

                "Mark 1: " + this.mark1 + ",\n " +
                "Mark 2: " + this.mark2 + ",\n " +
                "Mark 3: " + this.mark3 + ",\n " +
                "Average: " + this.average);
    }*/



} //class
