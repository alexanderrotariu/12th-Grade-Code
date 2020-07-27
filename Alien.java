public class Alien
{
    private int alienRow;
    private int type;
    private int health;
    private int speed;
    private String img;
    private int dmg;
    
    public Alien()
    {
        alienRow= (int)(Math.random()*5);
        health=10;
        type=0;
        speed=5;
        img="alien.gif";
        dmg = 1;
    }
    //Accessor methods
    public int getRow()
    {
        return alienRow;
    }
    public int getHealth()
    {
        return health;
    }
    public int getSpeed()
    {
        return speed;
    }
    public int getType()
    {
        return type;
    }
    
    //mutator methods
    public void setHealth(int h)
    {
        health=h;
    }
}