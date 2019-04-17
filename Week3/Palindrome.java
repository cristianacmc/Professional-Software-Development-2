package Week3;
import java.util.Scanner;
/**
 * Created by Cristiana Costa
 * on 2019-04-16
 * Program to check if a word is palindrome
 */

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra, newWord = "";

        System.out.print("Enter a sequence of characters,'A' to 'Z', to check if it is palindrome: ");
        palavra = scan.nextLine();

        char[] word = new char[palavra.length()];

        for(int i = 0; i < palavra.length(); i++ ){
            word[i] = palavra.charAt(i);
        }

        for(int i= word.length - 1; i >= 0 ; i--){
                newWord += word[i];
            }
        //removes all punctuation
        newWord = newWord.replaceAll("[^a-zA-Z ]", "");
        palavra = palavra.replaceAll("[^a-zA-Z ]", "");

        //remove white space
        String clearNewWord=newWord.replaceAll("\\s+","");
        String clearPalavra=palavra.replaceAll("\\s+","");

        if(clearNewWord.equalsIgnoreCase(clearPalavra) == true){
            System.out.println(palavra + " is palindrome");
        }else {
            System.out.println(palavra + " is not palindrome");
        }
    } //main
} //class
