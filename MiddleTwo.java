import javax.swing.JOptionPane;
public class MiddleTwo
{
    public static void main(String [] args)
    {
        String msg=JOptionPane.showInputDialog("Please enter a word");
        int len=msg.length();
        String middle2=msg.substring((len-1)/2, ((len-1)/2)+2);
        System.out.println(middle2);
    }
}