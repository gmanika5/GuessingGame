
/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money
{
    // instance variables - replace the example below with your own
    private static int money;
    private int score;
    private int bet;

    /**
     * Constructor for objects of class Money
     */
    public Money()
    {
        // initialise instance variables
        money =10;
        score=0;
        bet=0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void noMoney()
    {
        // put your code here
        System.out.print("You lost all your money.");
        System.exit(0);
    }
    
    public static void betting(int bet)
    {
        
          while (bet>money)
        {
            System.out.print("Bet cannot be greater than current money.");
            //go back
        }
        money= money - bet;
        //if guess=true win money
        money= money + (bet*2);
        System.out.print("Money:$" + money);
    }
    
    public static int dollars()
    {
        return money;
   }

}
