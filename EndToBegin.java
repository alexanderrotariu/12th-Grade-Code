import javax.swing.JOptionPane;

public class EndToBegin
{
    public static void main(String [] args)
    {
        String msg=JOptionPane.showInputDialog("Please enter a word");
        
        int len=msg.length();
        char last=msg.charAt(len-1);
        String rest=msg.substring(0,len-1);
        
        String fin=last+rest;
        System.out.println(fin);
    }
}