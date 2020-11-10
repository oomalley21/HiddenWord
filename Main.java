import java.util.Scanner;
import java.lang.Math;
public class Main {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in); 
     System.out.println("LENGTH OF WORD?");
     int length = scan.nextInt();
     while (length<3||length>6){
         System.out.println("PLEASE ENTER A LENGTH BETWEEN 3 AND 6");
         length = scan.nextInt();
        }
     HiddenWord word = new HiddenWord(length);
     
     System.out.println("GUESS MY WORD!");
     String guess = scan.nextLine();
     
     
     while (!guess.equals(word) && !word.gameOver(guess)){
         while (guess.length() != length){
          System.out.println("YOUR GUESS MUST CONTAIN " + length + " CAPITAL LETTERS");
          guess = scan.nextLine();
        }
         System.out.println(word.getHint(guess));
         guess = scan.nextLine();
        }
     
        System.out.println("CORRECT!");
     
     
    }
}
