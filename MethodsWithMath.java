public class MethodsWithMath
{
    
    
    public static void main(String [] args)
    {
        char sa = displayAorB();
        System.out.println(sa);
        
        
        String remove=removeRandom("abcde");
        System.out.println(remove);
        
        //testing method
        
        Double a = new Double(5.6);
        Double b= new Double(5.6);
        
        Double c = MethodsWithMath.checkEqual(a, b);
        System.out.println(c);
    }
    
    public static char displayAorB()
    {
        int a=(int)(Math.random()*4);
        
        if(a<3)
        {
            return 'B';
        }
        else 
        {
            return 'A';
        }
    }
    
    //Write a method that randomly removes a character from a string base on the position 
    public static String removeRandom(String str)
    {
        //abcde
        //01234 length 5
        String output;
        int len= str.length();
        int r=(int)(Math.random()*len);
        
        String first=str.substring(0,r);
        String second=str.substring(r+1);
        output=first+second;
        
        return output;
    }
    
    //Making a method for Integers
    
    public static Double checkEqual(Double a , Double b )
    {
        Double output;
        
        if(a.doubleValue()==b.doubleValue())
        {
            output= new Double(a.doubleValue()*b.doubleValue());
        }
        else
        {
            output=new Double(Math.abs(a.doubleValue()-b.doubleValue()));
        }
        return output;
    }
}