public class LogicalOperators
{
    public static void main (String [] args)
    {
        int caller=100;//any int
        boolean ZVIP=true;//or false
        
        if(caller==100&&ZVIP==true)
        {
            System.out.println("You win 200 dubloons");
        }
        else if(caller==100&&ZVIP==false)
        {
            System.out.println("You win 100 dubloons");    
        }
        else
        {
            System.out.println("you win no money sorry pal better luck next time");
        }
    }
}