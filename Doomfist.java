package BattleBugs;
import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.actor.Actor;

public class Doomfist extends BattleBug2012
{
    private int[] avoidedRC= new int[28];
    private int low=1;
    private int high=27;
    boolean needToMove;
    boolean pursingE = false;
    
    public Doomfist(int str, int def, int spd, String name, Color col)
    {
            super(str, def, spd, name, col);
    }
    public void act()
    {
        
        //declare a Location named goTo and initialize it with the location (5,5)
        Location goTo = new Location(5,5);
        
        
         
        //Call the getPowerUpLocs() method and store the result in a variable named puLocs.
        ArrayList<PowerUp> pu = getPowerUps();

        
        //CHECK TO SEE if there exists a PowerUp Location, if so then store the first location from the List into goTo
        if(pu.size()>0)
        {
            Location closest = pu.get(0).getLocation();
            for(int i = 0; i<pu.size(); i++)
            {
                if(distanceBetween2Points(getLocation(), pu.get(i).getLocation())<distanceBetween2Points(getLocation(),closest))                                      
                {
                    if(pu.get(i).getColor()==Color.BLUE&&avoidedRC[pu.get(i).getLocation().getRow()]!=-1&&avoidedRC[pu.get(i).getLocation().getCol()]!=-1)
                    {
                        closest=pu.get(i).getLocation();
                    }
                    else if(pu.get(i).getColor()==Color.RED&&avoidedRC[pu.get(i).getLocation().getRow()]!=-1&&avoidedRC[pu.get(i).getLocation().getCol()]!=-1)
                    {
                        closest=pu.get(i).getLocation();
                    }
                    else if(pu.get(i).getColor()==Color.GREEN&&avoidedRC[pu.get(i).getLocation().getRow()]!=-1&&avoidedRC[pu.get(i).getLocation().getCol()]!=-1)
                    {
                        closest=pu.get(i).getLocation();
                    }
                    else
                    {
                        
                    }
                        
                }
                else
                {
                    closest=pu.get(0).getLocation();
                }
            }
            goTo=closest;
                
        }
        ArrayList<Location> puLocs= getPowerUpLocs();

        
        ArrayList<Actor> actors = getActors(); 
        
        
        ArrayList<BattleBug> enemies = new ArrayList<BattleBug>();
        
        
        for(int i=0; i<actors.size();i++)
        {
            if(actors.get(i)instanceof BattleBug == true)
            {
                enemies.add((BattleBug)actors.get(i));
            }
        }
        
        if(enemies.size()>0&&getStrength()>5)
        {
            goTo=enemies.get(0).getLocation();
            pursingE=true;
        }
        else if(puLocs.size()>0)
        {
            goTo=puLocs.get(0);
        }
        
        int dir = getDirectionToward(goTo);

       
        if(getDirection()==dir)
        {  
            move();   
        }
        else if(enemies.size()>0&&getStrength()>5&&pursingE==true)
        {
            attack();
        }
        else
        {
            turnTo(dir);
        }
        
        if(getNumAct()%38==0)
        {
            avoidedRC[low] = -1;
            avoidedRC[high] = -1;
            low++;
            high--;
        }

        
    }
    public double distanceBetween2Points(Location one, Location two)
    {
        return Math.sqrt(Math.pow(two.getRow()-one.getRow(),2)+Math.pow(two.getCol()-one.getCol(), 2));
    }
}