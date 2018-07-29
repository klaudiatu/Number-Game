import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args){

        int randomNumber =(int) (Math.random() * 100)+1;
        boolean hasWon = false;

        System.out.println("I randomly selected number between 1 and 100.");
        System.out.println("Try to guess it :)");

        Scanner scanner = new Scanner(System.in);
        for(int i = 10; i>0; i--){
            System.out.println("You have "+ i +" guesses left. ");
            int guess = scanner.nextInt();

            if (randomNumber < guess){
                System.out.println("Number you guessed too big. Try again.");
            }else if(randomNumber > guess){
                System.out.println("Number you guessed is too small. Try again.");
            }else if (randomNumber == guess){
                hasWon = true;
                break;
            }

        }

        if (hasWon){

            System.out.println("SUCCES! It's correct! You win!");
        }else {
            System.out.println("Game over. Number was "+ randomNumber);

        }

    }
}
