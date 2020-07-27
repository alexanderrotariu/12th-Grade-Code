public class Arrays
{
    public static void main(String [] args)
    {
        int [] grades;
        String [] names;
        
        grades= new int[4];
        names= new String[4];
        
        String[] names2={"Billy", "Fred", "Bob"};
        
        grades[0]=78;
        grades[1]=99;
        grades[2]=100;
        grades[3]=85;
        
        //find the sum of the elements at 0 and 2
        int sum = grades[0]+grades[2];
        System.out.println(sum);//178
        
        //Swap the elements at 1 and 2
        int temp = grades[1];
        grades[1]=grades[2];
        grades[2]=temp;
        
        
        
    }
}