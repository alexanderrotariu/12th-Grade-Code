public class Fraction
{
    //Instance Variables are declared in a class but not in a method
    //Instance Variables must be declared private
    
    //Step 1
    //Instance variables exist in the entire class
    //Private means that it can only be accessed in THIS class
    
    private int numer;
    private int denom;
    
    //Step 2 constructors
    //Allow us to make instances of our classes
    //In the constructor you must initialize ALL your instance variables
    //Default constructor
    public Fraction()
    {
        numer=1;
        denom=1;
    }
    //Parameterized constructors
    public Fraction(int n, int d)
    {
        if(d<0)
        {
            numer = -n;
            denom = -d;
        }
        else
        {
            numer = n;
            denom = d;
        }
        this.simplify();
    }
    public Fraction(int n)
    {
        numer = n;
        denom = 1;
    }
    
    //STep 3 to String method
    public String toString()
    {
        if(denom==0)
        {
            return "undefined";
        }
        else if(numer == 0)
        {
            return "0";
        }
        else if(denom == 1)
        {
            return numer+"";
        }
        else
        {
            return numer+"/"+denom;
        }
    }
    //Accessor methods allows us to get the instance variables one at a time 
    public int getNumer()
    {
        return numer;
    }
    public int getDenom()
    {
        return numer;
    }
    
    //Mutator methods
    private void setNumer(int n)
    {
        numer=n;
    }
    private void setDenom(int d)
    {
        denom=d;
    }
    //interesting methods
    public double convertToDec()
    {
        return(double)numer/denom;
    }
    
    public Fraction getReciprocal()
    {
        return new Fraction(denom, numer);
    }
    
    public Fraction times(Fraction anotherFraction)
    {
        //return new Fraction(numer*anotherFraction.getNumer(), denom*anotherFraction.getDenom());
        Fraction output;
        int oNumer= numer* anotherFraction.getNumer();
        int oDenom= denom * anotherFraction.getDenom();
        
        output= new Fraction(oNumer, oDenom);
        return output;
    }
    
    public Fraction dividedBy(Fraction anotherFraction)
    {
        Fraction output = this.times(anotherFraction.getReciprocal());
        return output;
    }
    
    public Fraction plus(Fraction anotherFraction)
    {
        Fraction output;
        //Fraction tTA=new Fraction(numer*anotherFraction.getDenom(), denom*anotherFraction.getDenom());
        //Fraction aTt=new Fraction(anotherFraction.getNumer()*denom,anotherFraction.getDenom()*denom);
        
        int oNumer= numer*anotherFraction.getDenom()+anotherFraction.getNumer()*denom;
        int oDenom= denom*anotherFraction.getDenom();
        output=new Fraction(oNumer,oDenom);
        //output= new Fraction(tTA.getNumer()+aTt.getNumer(), tTA.getDenom());
        return output;
    }
    public Fraction minus(Fraction anotherFraction)
    {
        Fraction output;
        //Fraction tTA=new Fraction(numer*anotherFraction.getDenom(), denom*anotherFraction.getDenom());
        //Fraction aTt=new Fraction(anotherFraction.getNumer()*denom,anotherFraction.getDenom()*denom);
        
        int oNumer= numer*anotherFraction.getDenom()-anotherFraction.getNumer()*denom;
        int oDenom= denom*anotherFraction.getDenom();
        output=new Fraction(oNumer,oDenom);
        //output= new Fraction(tTA.getNumer()+aTt.getNumer(), tTA.getDenom());
        return output;
    }
    
    private int findGCF()
    {
        if(numer==0 || denom==0)
            return 1;
        
        int n = Math.abs(numer);
        int d = Math.abs(denom);
        
        while(n!=d)
        {
            if(n>d)
                n=n-d;
            else 
                d=d-n;
        }
        return n;
    }
    
    public void simplify()
    {
        int gcf= this.findGCF();
        numer/=gcf;
        denom/=gcf;
    }
    
    
}


        