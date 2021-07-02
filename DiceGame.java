import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){
        Random r1 = new Random();
        Random r2 = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Rolling the dice...");
        int die1 = r1.nextInt(6) + 1;
        int die2 = r2.nextInt(6) + 1;
        System.out.println("Die1: " + die1);
        System.out.println("Die2: " + die2);
        System.out.println("Total value: " + (die1 + die2));
        if(die1 + die2 > 7){
            System.out.println("You won!");
        }else{
            System.out.println("You lose!");
        }
    }
}