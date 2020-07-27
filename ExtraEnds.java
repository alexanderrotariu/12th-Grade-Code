import javax.swing.JOptionPane;
public class ExtraEnds
{
    public static void main(String [] args)
    {
        String msg=JOptionPane.showInputDialog("Please enter a word");
        
        int len=msg.length();
        String lastTwo=msg.substring(len-2);
        String fin=(lastTwo+lastTwo+lastTwo);
        
        System.out.println(fin);
    }
}