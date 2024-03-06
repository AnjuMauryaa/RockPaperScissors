import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String arf[]) {

        // o for rock
        // 1 for paper
        // 2 for scissor
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 for rock , 1 for paper, 2 for scissor:");
            int userInput = sc.nextInt();

            Random random = new Random();
            int computerInput = random.nextInt(3);

        // winner declaration

        if(userInput == computerInput)
        {
            System.out.println("Draw!");
        }

        else if(userInput == 0 && computerInput ==2 || userInput == 1 && computerInput ==0 || userInput == 2 && computerInput == 1)
        {
            System.out.println("You win!");
        }

        else{
            System.out.println("Computer win!");
        }

        

        if(computerInput == 0)
        {
            System.out.println("Computer choice: rock");
        }

         else if(computerInput == 1)
        {
            System.out.println("Computer choice: paper");
        }

        else
        {
            System.out.println("Computer choice: scissor");
        }
        sc.close();

    }
}
