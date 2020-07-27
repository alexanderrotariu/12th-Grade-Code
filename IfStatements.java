public class IfStatements
{
    public static void main (String [] args)
    {
        //Creating a program that calculates the grade you got 
        
        int grade=90;//any int
        
        if(grade>=90)
        {
            System.out.println("A");
        }
        else if(grade>=80)
        {
            System.out.println("B");
        }
        else if(grade>=70)
        {
            System.out.println("C");
        }
        else if(grade>=65)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
        
        //Problem 8
        String input="school";
        int len=input.length();
        char firstLet=input.charAt(0);
        char lastLet=input.charAt(len-1);
        
        if(firstLet==lastLet)
        {
            System.out.println(input=input.substring(1,len-1));
        }
        else
        {
             System.out.println(input);
        }
        
        //Problem 9
        String input1="Space";
        int len1=input1.length();
        String firstPart="";
        String secondPart="";
        char middle;
        
        if(len1%2==0)
        {
            firstPart=input1.substring(0,len1/2);
            secondPart=input1.substring(len1/2);
            System.out.println(firstPart+" "+secondPart);
        }
        else
        {
            firstPart=input1.substring(0,(len1/2));
            middle=input1.charAt(len1/2);
            secondPart=input1.substring(len1/2+1);
            System.out.println(firstPart+" "+middle+" "+secondPart);
        }
    
        
        
        
    }
}