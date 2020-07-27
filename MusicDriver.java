public class MusicDriver
{
    public static void main(String [] args)
    {
        Song s1=new Song();
        Song s2=new Song("Star Spangled Banner","C:\\Users\\Emmanuel\\Desktop\\Music");
        
        System.out.println(s1);
        System.out.println(s2);
    }
}