
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class Tower
{
    //Instance Variables
    private int locationX;
    private int locationY;
    private int towerType;
    private String imageU;
    //0 -> soldier cat dmg 1
    //1 -> demo cat 
    //2 -> Wizard cat
    //3 -> ninja cat
    //4 -> 
    private int towerHealth;
    private int towerDmg;
    
    public Tower()
    {
        locationX=1;
        locationY=1;
        towerType=0;
        imageU="tower.gif";
        towerHealth=2;
        towerDmg=1;
    }
    public Tower(int x, int y, int t, String img)
    {
        locationX=x;
        locationY=y;
        towerType=t;
        imageU=img;
        towerHealth=2;
        towerDmg=1;
    }
    
    public String toString()
    {
        return "Location of "+imageU+": ("+locationX+", "+locationY+") of type "+towerType;
    }
    
    //Accessor Methods
    public int getX()
    {
        return locationX;
    }
    public int getY()
    {
        return locationY;
    }
    public int getType()
    {
        return towerType;
    }
    public String getImage()
    {
        return imageU;
    }
    public int getHealthT()
    {
        return towerHealth;
    }
    
    public void setHealthT(int h)
    {
        towerHealth=h;
    }
    public void setX(int  x)
    {
        locationX=x;
    }
    public void setY(int y)
    {
        locationY=y;
    }
    public void setImg(String img)
    {
        imageU=img;
    }
    public void setType(int t)
    {
        towerType=t;
    }
    public void towerShoot()
    {
        return;
    }
    

}