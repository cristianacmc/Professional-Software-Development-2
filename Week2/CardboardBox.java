package Lab2;

/**
 * Created by Cristiana Costa
 * on 2019-04-03
 * Program to create a cardboard class with methods
 */

public class CardboardBox {

    private int width = 3;
    private int heigth = 6;
    private int depth = 8;
    private String colour = "Green";

    private static int noOfBoxes = 0;



    public CardboardBox(){

        noOfBoxes ++;
    }

    public static int noOfBoxes(){
        return noOfBoxes;
    }

    public CardboardBox(int customWidth, int customHeigth, int customDepth, String customColour){

        width = customWidth;
        heigth = customHeigth;
        depth = customDepth;
        colour = customColour;
        noOfBoxes ++;
    }

    public CardboardBox(int customWidth, int customHeigth, int customDepth){

        width = customWidth;
        heigth = customHeigth;
        depth = customDepth;
        noOfBoxes++;

    }


    // setters methods
    public void setWidth(int itsWidth){
        width = itsWidth;
    }

    public void setHeigth (int itsHeigth){
        heigth = itsHeigth;
    }

    public void setDepth (int itsDepth){
        depth = itsDepth;
    }

    public void setColour (String itsColour){
        colour =itsColour;
    }

    // getters methods
    public int getWidth(){
        return width;
    }

    public int getHeigth(){
        return heigth;
    }

    public int getDepth(){
        return depth;
    }

    public String getColour(){
        return colour;
    }

    // 1.3
    private int volume(){
        return width * heigth * depth;
    }

    // 1.4
    public void showAllDetails(){
        System.out.println("The WIDTH of the cardboard box is " + width + " units");
        System.out.println("The HEIGTH of the cardboard box is " + heigth + " units");
        System.out.println("The DEPTH of the cardboard box is " + depth + " units");
        System.out.println("The COLOUR of the cardboard box is " + colour);
        System.out.println("The VOLUME of the cardboard box is " + volume() + " units");
        System.out.println("**************************");
        System.out.println();
    }

    // 1.5
    public void printTopArea(int customWidth, int customDepth) {
        System.out.println("The Top Area of the box is " + (customDepth * customWidth) + " units");
    }

    public void printFrontArea(int customWidth, int customHeigth) {
        System.out.println("The Front Area of the box is " + (customHeigth * customWidth) + " units");
    }

    public void printSideArea(int customDepth, int customHeigth) {
        System.out.println("The Side Area of the box is " + (customHeigth * customDepth) + " units");
        System.out.println("**************************");
        System.out.println();
    }

    // challenge
    public int requiredBoxes(int customVolume){

        return customVolume / (width * heigth * depth) ;

    }


    public static void main(String[] args) {
    } //main

} //class
