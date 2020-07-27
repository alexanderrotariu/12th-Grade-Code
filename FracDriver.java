public class FracDriver
{
    public static void main(String [] args)
    {
        Fraction f1 = new Fraction();
        
        //declaring and instantiating f2 with parameterized constructor
        
        Fraction f2 = new Fraction(2,3);
        
        Fraction f3= new Fraction(5);

        System.out.println("f1 = "+f1);
        System.out.println("f2 = "+f2);
        System.out.println("f3 = "+f3);

        Fraction f4= new Fraction(4,-5);
        Fraction f5= new Fraction(-2,-5);
        System.out.println("f4 = "+f4);
        System.out.println("f5 = "+f5);
        
        //Testing Accessor and Mutator meathods
        int n4=f4.getNumer();
        System.out.println("The numer of f4 is "+n4);
        
        int d2=f2.getDenom();
        System.out.println("The denom of f2 is "+d2);
        
        //Testing the mutator methods
        //f1.setNumer(5);
        //f1.setDenom(8);
        //System.out.println("f1 is now "+f1);
        
        double dec5 = f5.convertToDec();
        System.out.println(f1 + " = "+dec5);
        
        //Testing the getRecip method
        Fraction rec2 =f2.getReciprocal();
        System.out.println("The reciprocal of "+f2+" is "+rec2);
        
        //Testing multiplication
        Fraction prod24=f2.times(f4);
        System.out.println(prod24);
        
        //Testing division 
        Fraction quo24=f2.dividedBy(f4);
        System.out.println(quo24);
        
        //Testing the simplify methid
        System.out.println("quo24 = "+quo24);
        
        prod24.simplify();
        System.out.println(prod24);
        
        
        
        
    }
}