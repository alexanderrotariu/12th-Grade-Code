import javax.swing.JOptionPane;
public class IfStatementHw
{
    public static void main(String [] args)
    {
        //Problem 3 
        String input1=JOptionPane.showInputDialog("Problem 3: Please enter your words");
        String input2=JOptionPane.showInputDialog("Problem 3: Please enter another word");
        
        int len1=input1.length();
        int len2=input2.length();
        
        if(len1%2==0&&len2%2==1||len1%2==1&&len2%2==0)
        {
            char firstLet=input1.charAt(0);
            char lastLet=input2.charAt(len2-1);
            
            System.out.println(firstLet +""+ lastLet);
        }
        else if(len1%2==1&&len2%2==1)
        {
            System.out.println(input1+input2);
        }
        else
        {
            String firstHalf=input1.substring(0, len1/2);
            String secondHalf=input2.substring(len2/2);
            
            System.out.println(firstHalf+secondHalf);
        }
        
        //Problem 4 
        String input=JOptionPane.showInputDialog("Problem 4: Please eneter a word");
        int posOfa=input.indexOf("a");
        int posOfb=input.indexOf("b");
        char middle;
        if(posOfa+2==posOfb)
        {
            middle=input.charAt(posOfa+1);
            System.out.println(middle+middle+middle);
        }
        else if(posOfb+2==posOfa)
        {
            middle=input.charAt(posOfb+1);
            System.out.println(""+middle+middle+middle);
        }
        else
        {
            System.out.println(input);
        }
        
        
        
    }
}