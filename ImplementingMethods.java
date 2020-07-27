public class ImplementingMethods
{
    //We can write a method here
    public static void main (String[] args)
    {
        //calling a method thats static
        print3a();
        ImplementingMethods.print3a();
        
        // calling a method that isnt static 
        //ImplementingMethods vaar = new ImplementingMethods();
        print3b();
     
        int a=largestInt(1,3);
        System.out.println(a);
        
        //PROBLEM1
        boolean b=in1020(8,99);
        System.out.println(b);
        
        //PROBLEM 2
        boolean c=makes10(9,1);
        System.out.println(c);
        
        //PROBLEM 3
        boolean d=loneTeen(13,99);
        System.out.println(d);
        
        //PROBLEM 4
        String e=notString("not hello");
        System.out.println(e);
        
        //PROBLEM 5
        String f=missingChar("kitten", 4);
        System.out.println(f);
        
        //PROBLEM 6
        String g=removeChar("KITTEN", 'K', false);
        System.out.println(g);
        
        //PROBLEM 7
        int h=close10(13, 7);
        System.out.println(h);
        
        //PROBLEM 8
        int i=kindaSum(123);
        System.out.println(i);
        
        //PROBLEM 9
        int j=dateFashion(5,5);
        System.out.println(j);
        
        //PROBLEM 10
        String k=order("super","duper");
        System.out.println(k);
        
        
        
        
        //PROBLEM 13
        String z=evilE("seEd");
        System.out.println(z);
    }   
    //We can write a method here
    //Lets write a method that prints the letter a 3 times
    public static void print3a()
    {
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");
    }
    public static void print3b()
    {
        System.out.println("B\nB\nB");
    }
    
    //helper methods print3a and print3b
    public static void print9lets()
    {
        print3a();
        print3b();
        print3a();
        
    }
    
    //write a method that accepts two ints and returns the largest int
    public static int largestInt(int a, int b)
    {
        int output;
        
        if(a>b)
        {
            output=a;
        }
        else if(a<b)
        {
            output=b;
        }
        else
        {
            output=a;
        }
        return output;
    }
 
    //PROBLEM 1
    public static boolean in1020(int a, int b)
    {
        boolean output;
        
        if((a>=10&&a<=20)||(b>=10&&b<=20))
            output=true;
        else 
            output=false;
        
        return output;
    }
    
    //PROBLEM 2
    public static boolean makes10(int a, int b)
    {
        boolean output;
        
        if(a ==10||b==10)
            output=true;
        else if(a+b==10)
            output=true;
        else 
            output=false;
        
        return output;
    }
    
    //PROBLEM 3
    
    public static boolean loneTeen(int a, int b)
    {
        boolean output;
        
        if((a<=19&&a>=13)&&(b<=19&&b>=13))
        {
            output=false;
        }
        else if(a<=19&&a>=13)
        {
            output=true;
        }
        else if(b<=19&&b>=13)
        {
            output=true;
        }
        else
        {
           output=false;
        }
        return output;
    }
    
    //PROBLEM 4
    
    public static String notString(String x)
    {
        String output;
        int len=x.length();
        
        if(len<4)
        {
            output="not "+x;
        }
        else
        {
            if(x.substring(0,4).equals("not "))
            {
                output=x;
            }
            else
            {
                output="not "+x;
            }       
        }
        
        return output;
    } 
    //PROBLEM 5
    
    public static String missingChar(String str, int n)
    {
        String output;
        int len = str.length();
        
        String first=str.substring(0,n);
        String second=str.substring(n+1);
        output=first+second;
        return output;
        
    }
    
    //PROBLEM 6
    public static String removeChar(String str, char c, boolean remove)
    {
        String output;
        
        if(remove==false)
        {
            output=str;
        }
        else if(str.indexOf(c)>=0)
        {
            int a = str.indexOf(c);
            output=missingChar(str,a);
        }
        else
        {
            output=str;
        }
        return output;
    }
    
    //PROBLEM 7
    
    public static int close10(int a, int b)
    {
        int output;
        
        int difference= Math.abs(10-b);
        int difference1= Math.abs(10-a);
        
        if(difference<difference1)
        {
            output=b;
        }
        else if(difference1<difference)
        {
            output=a;
        }
        else
        {
            output=0;
        }
        return output;
        
        
    }
    
    //PROBLEM 8
    public static int kindaSum(int num)
    {
        int output;
        int lastTwo=num%100;
        int ones=lastTwo%10;
        int tens=lastTwo/10;
        
        output=tens+ones;
        return output;
        
    }
    
    //PROBLEM 9
    public static int dateFashion(int you, int date)
    {
        int output;
        
        if(you>=8||date>=8)
        {
            output=2;
        }
        else if(you<=2||date<=2)
        {
            output=0;
        }
        else 
        {
            output=1;
        }
        return output;         
    }
    
    //PROBLEM 10
    public static String order(String str1, String str2)
    {
        String output;
        int compare=str1.compareTo(str2);
        
        if(str1.equals(str2))
        {
            output=str1+str2;
        }
        else if(compare<0)
        {
            output= str1+str2;
        }
        else
        {
            output=str2+str1;
        }
        return output;
    }
    
    //PROBLEM 11
    public static boolean squirrelPlay(int temp, boolean isSummer)
    {
        boolean output;
        
        if(isSummer==true)
        {
            if(temp>=60&&temp<=100)
            {
                output=true;
            }
            else
            {
                output=false;
            }
        }
        else
        {
            if(temp>=60&&temp<=90)
            {
                output=true;
            }
            else 
            {
                output=false;
            }
        }
        return output;
    }
    
    
    //PROBLEM 12
    
    public static boolean funnyHatParty(int funnyHats, boolean isWeekend)
    {
        boolean output;
        if(isWeekend)
        {
            if(funnyHats>=40&&funnyHats<=60)
            {
                output=true;
            }
            else 
            {
                output=false;
            }
        }
        else
        {
            if(funnyHats>=40)
            {
                output=true;
            }
            else
            {
                output=false;
            }
        }
        return output;
    }
    
        public static String evilE(String str)
    {
        String output;
        int posOfE=str.indexOf('E');
        int len = str.length();
        
        if(posOfE<0||len==1)
        {
            output=str;
        }
        else
        {
            if(posOfE==0)
            {
                char right = str.charAt(1);
                String rightOfE;
                if(right=='e'||right=='E')
                {
                    rightOfE= str.substring(posOfE+1);
                }
                else
                {
                    rightOfE=" "+str.substring(posOfE+2);
                }
                output="E"+rightOfE;
            }
            else if(posOfE==len-1)
            {
                char left = str.charAt(len-2);
                String leftE;
                if(left=='e')
                {
                    leftE=str.substring(0,posOfE);
                }
                else
                {
                    leftE=str.substring(0,posOfE-1)+" ";
                }
                output=leftE+"E";
            }
            else
            {
                String leftE, rightE;
                char left= str.charAt(posOfE-1);
                char right=str.charAt(posOfE+1);
                
                if(left=='e')
                {
                    leftE=str.substring(0, posOfE);
                }
                else
                {
                    leftE=str.substring(0,posOfE-1)+" ";
                }
                if(right=='e'||right=='E')
                {
                    rightE=" "+str.substring(posOfE+1);
                }
                else
                {
                    rightE=" "+str.substring(posOfE+2);
                }
                output=leftE+"E"+rightE;           
            }
            return output;
        }
       
        /*if(posOfE<0)
        {
            output=str;
        }
        else
        {
            if(posOfE==0)
            {
                if(str.charAt(1)=='e'||str.charAt(1)=='E')
                    output=("E "+str.substring(2));
                else
                    output=("E "+str.substring(2));
            }
            else if(posOfE==len-1)
            {
                if(str.charAt(posOfE-1)=='e'||str.charAt(posOfE-1)=='E')
                    output=(str.substring(0,posOfE-1)+"eE");
                else
                    output=(str.substring(0,posOfE-1)+" E");
            }
            else     
            {
                //no e/E on the left
                if((str.charAt(posOfE-1)!='e'||str.charAt(posOfE-1)!='E'))
                    output=(str.substring(0,posOfE-1)+" E"+str.substring(posOfE+1));
                //no e/E on the right
                else if((str.charAt(posOfE+1)!='e'||str.charAt(posOfE+1)!='E'))
                    output=(str.substring(0,posOfE-1)+"E "+str.substring(posOfE+1));
                //no e/E on either side
                else
                    output=(str.substring(0,posOfE-1)+" E "+str.substring(posOfE+2));
            }
        }
        return output;
                */
        
        
        
    

    
    
    
}
