
/**
 * Write a description of class Guess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guess 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Guess
     */
    public Guess()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int random(int num)
    {
        // put your code here
        return (int)(Math.random()*num);
    }
}
