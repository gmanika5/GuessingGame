
/**
 * The Money class contains methods related to money.
 * 
 * @Gajesh Manikanden 
 * @Version 1
 */
public class Money
{
    private static int money;
    private int score;
    private int bet;

    /**
     * Constructor for objects of class Money
     */
    public Money()
    {
        money =10;
        
        bet=0;
    }

    //what happens if you have no money left to bet
    public static void noMoney()
    {
        // put your code here
        System.out.println("You lost all your money.");
        System.exit(0);
    }
    //bet win
    public static void betting(int bet)
    {
        //bet win
        money= money - bet;
        //if guess=true win money
        money= money + (bet*2);
        System.out.println("Money:$" + money);
    }
    //bet lose
    public static void loseBet(int bet)
    {
        money= money - bet;
        
    }
    //return current money
    public static int dollars()
    {
        return money;
    }

}
