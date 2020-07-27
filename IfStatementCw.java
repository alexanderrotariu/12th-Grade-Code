import javax.swing.JOptionPane;
public class IfStatementCw
{
    public static void main(String [] args)
    {
        //Problem #1 classwork
        String input=JOptionPane.showInputDialog("Please enter a word followed by a number");
        int len=input.length();
        int posOfColon=input.indexOf(":");
        String GetNum=input.substring(posOfColon+1);
        int num=Integer.parseInt(GetNum);
        String word=input.substring(0,posOfColon);
        
        if(num>=0&&num<=(len-1))
        {
            String firstPart=word.substring(0,num);
            String secondPart=word.substring(num+1);
            System.out.println(firstPart+"X"+secondPart);
        }
        else
        {
            System.out.println(word);
        }
        
    }
}