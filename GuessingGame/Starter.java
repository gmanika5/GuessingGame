import java.util.Scanner;
/**
 * Write a description of class Starter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starter
{
    public static void main(String[] args)
    {  
        boolean cont=true;
        Scanner sc=new Scanner(System.in);
        Money money=new Money();
        System.out.println(money.dollars());     
       

        while (cont==true)
        {
            if (money.dollars() < 1)
            {
                Money.noMoney();
            }
            System.out.println(money.dollars());
            System.out.println("Continue? (True or False)"); 
            cont=sc.nextBoolean();
        }
    }
}
