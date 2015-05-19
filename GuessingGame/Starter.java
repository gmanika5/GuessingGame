
/**
 * Write a description of class Starter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starter extends Money
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args)
    {  
        boolean cont=true;

        Money x= new Money();
        System.out.println(x);
        Money.noMoney();
        System.out.println(x);

        while (cont==true)
        {
            if (x.dollars() < 1)
            {
                   noMoney();
            }
            //System.out.println(x.dollars());
        }
    }
}
