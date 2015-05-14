
/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money
{
    // instance variables - replace the example below with your own
    private int money;
    private int score;

    /**
     * Constructor for objects of class Money
     */
    public Money()
    {
        // initialise instance variables
        money = 10;
        score=0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void noMoney(int y)
    {
        // put your code here
        System.out.print("You lost all your money.");
        System.exit(0);
    }
}
