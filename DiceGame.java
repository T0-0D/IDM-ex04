import java.util.Random;

public class DiceGame{
    public static void main(String[] args){
        Random r1 = new Random();
        Random r2 = new Random();
        System.out.println("Rolling the dice...");
        System.out.println("Die1: " + (r1.nextInt(6)+1));
        System.out.println("Die2: " + (r2.nextInt(6)+1));
    }
}