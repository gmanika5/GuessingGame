import java.util.Scanner;
/**
 * Write a description of class Starter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starter
{
    public static int random()
    {
        // put your code here
        return (int)(Math.random()*100);
    }

    public static void main(String[] args)
    {  
        boolean cont=true;
        Scanner sc=new Scanner(System.in);
        Money money=new Money();
        int number=0;
        int response=0;

        while (cont==true)
        {
            if (money.dollars() < 1)
            {
                Money.noMoney();
            }
            System.out.println(money.dollars());
            System.out.println("Continue betting? (True or False)"); 
            cont=sc.nextBoolean();
            System.out.println("Guessing game, 100 numbers to guess from");
            System.out.println("How much are you betting?");
            int bet=sc.nextInt();
            while (bet > Money.dollars())
            {
                System.out.println("Bet cannot be greater than current balance.");
                System.out.print("Bet a smaller amount : ");
                bet=sc.nextInt();
            }
            number=random();
            for (int i=0; i<5; i++)
            {
                response=sc.nextInt();
                if (response == number)
                {
                    System.out.println("Correct");
                    i=4;
                    Money.betting(bet);
                }

                if (response > number)
                {
                    System.out.println("Guess smaller");
                }
                if (response < number)
                {
                    System.out.println("Guess bigger");
                }

            }
            if (response != number)
            {
                System.out.println("You lose the bet.");
                Money.loseBet(bet);
            }
        }
    }
}
