//Importing the classes I need
import java.util.Date;

public class LearningObjects
{
    public static void main(String [] args)
    {
        //Declaring a Date object
        Date today= new Date();
        
        //displaying the Date variable 
        System.out.println(today);
        
        
        //Setting a new date
        Date jday=new Date(102,8,22);
        System.out.println(jday);
        
        
        //Declaring more variables 
        int x=5;
        String str="yea";
        
        
        //Calling methods and then displaying
        
        int m= today.getMonth();
        System.out.println(m);
        
        String str1="Hello";
        
        
    }
}