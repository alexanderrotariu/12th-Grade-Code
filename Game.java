public class Game
{
  private Grid grid;
  private int userRow;
  private int msElapsed;
  private int timesGet;
  private int timesAvoid;
  private int level;
  private boolean start;
  
  public Game()
  {
    grid = new Grid(6, 11);
    //userRow = 1;
    msElapsed = 0;
    timesGet = 0;
    timesAvoid = 0;
    updateTitle();
    level = 1;
    start =false;
    
    int heallthTL1=1;
    //User Location
    
      
    //grid.setImage(new Location(userRow, 0), "user.gif");
    
    //Tower Locations by default for selection
    Tower t1 = new Tower(0, 2, 0, "tower1.gif");
    Tower t2 = new Tower(0, 3, 1, "tower2.gif");
    Tower t3 = new Tower(0, 4, 2, "tower3.gif");
    Tower t4 = new Tower(0, 5, 3, "tower4.gif");
    Tower t5 = new Tower(0, 6, 4, "tower5.gif");
    //towers
    grid.setImage(new Location(t1.getX(), t1.getY()), t1.getImage());
    grid.setImage(new Location(t2.getX(), t2.getY()), t2.getImage());
    grid.setImage(new Location(t3.getX(), t3.getY()), t3.getImage());
    grid.setImage(new Location(t4.getX(), t4.getY()), t4.getImage());
    grid.setImage(new Location(t5.getX(), t5.getY()), t5.getImage());
    //Start button
    grid.setImage(new Location(0, 8), "start.gif");
    
    //end
    grid.setImage(new Location(1,0), "crown.gif");
    grid.setImage(new Location(2,0), "crown.gif");
    grid.setImage(new Location(3,0), "crown.gif");
    grid.setImage(new Location(4,0), "crown.gif");
    grid.setImage(new Location(5,0), "crown.gif");
    
    grid.setBackground("bg.gif");
    int alienH=10;
    
  }
  
  public void play()
  {
    while (!isGameOver())
    {
      grid.pause(100);
        
      handleKeyPress();
      if (msElapsed % 3000 == 0)
      {
        populateRightEdge();
        moveRow1Left();
        moveRow2Left();
        moveRow3Left();
        moveRow4Left();
        moveRow5Left();
      }
        if(msElapsed % 1000 == 0)
        {
            attackAliensR1();
        }
      //  scrollLeft(); 
      
      updateTitle();
      msElapsed += 100;
    }
  }
  
  public void selectTower(Tower sT)
  {
     // Location selectedTower=grid.checkLastLocationClicked();
      if(sT==null)
      {
        Location selectedTower=grid.checkLastLocationClicked(); 
      //  output= new Tower(selectedTower.getRow(), selectedTower.getCol(), 0, grid.getImage(selectedTower
        sT.setX(selectedTower.getRow());
        sT.setY(selectedTower.getCol());
        sT.setType(0);
        sT.setImg(grid.getImage(selectedTower));
        return;
      }
      return;
  }
  public void resetTower(Tower sT)
  {
      sT= null;
  }
  public void placeTower(Location l, String img)
  {
      Tower output;
      output = new Tower(l.getRow(), l.getCol(), 0, img);
      grid.setImage(l, img);
      return;
  }
  
  public void handleKeyPress()
  {
      
    int key = grid.checkLastKeyPressed();
    Location locClick = grid.checkLastLocationClicked();
    Tower selected=null;
    Location desiredLoc=null;
    
    //These are always in use 
    Tower t1 = new Tower(0, 2, 0, "tower1.gif");
    Tower t2 = new Tower(0, 3, 1, "tower2.gif");
    Tower t3 = new Tower(0, 4, 2, "tower3.gif");
    Tower t4 = new Tower(0, 5, 3, "tower4.gif");
    Tower t5 = new Tower(0, 6, 4, "tower5.gif");
    

    //Code for letting the user select towers----------------------------------------
    if(locClick!=null)
    {
        if(locClick.equals(new Location(0,8)))
            start=true;
        else if(locClick.equals(new Location(0, 2)))
            selected=t1;
        else if(locClick.equals(new Location(0,3)))
            selected=t2;
        else if(locClick.equals(new Location(0,4)))
            selected=t3;
        else if(locClick.equals(new Location(0,5)))
            selected=t4;
        else if(locClick.equals(new Location(0,6)))
            selected=t5;
                
        while(selected!=null)
        {
                desiredLoc=grid.checkLastLocationClicked();
                System.out.println(desiredLoc);

            if(selected!=null&&(desiredLoc!=null))
            {
                placeTower(desiredLoc, selected.getImage());
                selected=null;
                desiredLoc=null;
            }
        }
    }
    //------------------------------------------------------------------
    
    if(key==38 && userRow!=1)
    {
        grid.setImage(new Location(userRow, 0), null);
        userRow=userRow-1;
        handleCollision(new Location(userRow+1,0));
        grid.setImage(new Location(userRow, 0), "user.gif");
    }
    if(key==40 && userRow!=grid.getNumRows()-1)
    {
        grid.setImage(new Location(userRow, 0), null);
        userRow=userRow+1;
        handleCollision(new Location(userRow-1,0));
        grid.setImage(new Location(userRow, 0), "user.gif");
    }
      
  }
  
  public void populateRightEdge()//witha aliens
  {      
      //int rand=(int)(Math.random()*100); no randoms because rn everything is aliens
      
      /*if(rand%2==0)
      {
        int row = (int)(Math.random()*grid.getNumRows()-1)+1;
        int col = grid.getNumCols()-1;
        grid.setImage(new Location(row, col), "get.gif");
      }
      else
      {
        int row = (int)(Math.random()*grid.getNumRows()-1)+1;
        int col = grid.getNumCols()-1;
        grid.setImage(new Location(row, col), "avoid.gif");
      }  
*/
      //decide what row you want to place an alien
      int le1=5;
      int le2=10;
      int le3=15;
      int le4=20;
      int le5=25;
      //LEVEL 6 BOSS?
      
      //if start was clicked
      if(start==true)
      {
          if(level==1)
          {
            for(int i=0;i<le1;i++)
            {
              int row = (int)(Math.random()*grid.getNumRows()-1)+1;
              int col = grid.getNumCols()-1;
              
              grid.setImage(new Location(row, col), "alien.gif");
            }
            start=false;
          }
      }
      
      
      
  }
  /*
  public void scrollRow(int row)
  {
      int i = 0;
          if(grid.getImage(new Location(row,i))==null)
          {
              
          }
          else if(grid.getImage(new Location(row,i)).equals("user.gif")==true)
          {
              //grid.setImage(new Location(row, i), null);
             // grid.setImage(new Location(row, i-1), img);
          }
          else
          {
              String img = grid.getImage(new Location(row,i));
              grid.setImage(new Location(row, i), null);
              grid.setImage(new Location(row, i-1), img);
          }
      i++;
  }
  */
  //public void scrollLeft()
  //{
      
      //Location userLocation = new Location(userRow,1);
      //handleCollision(userLocation);
      //if(msElapsed%5001==0)
      //{
      
    //Tower t1 = new Tower(0, 2, 0, "tower1.gif");
    //Tower t2 = new Tower(0, 3, 1, "tower2.gif");
    //Tower t3 = new Tower(0, 4, 2, "tower3.gif");
    ///Tower t4 = new Tower(0, 5, 3, "tower4.gif");
    //Tower t5 = new Tower(0, 6, 4, "tower5.gif");
    
        /*for(int r = 0; r< grid.getNumRows();r++)
        {
            for(int c = 1; c<grid.getNumCols();c++)
            {
                String img = grid.getImage(new Location(r,c));
                String left= grid.getImage(new Location (r, c-1));
                if(img==null||img.equals("crown.gif")||img.equals("tower1.gif")||img.equals("tower2.gif")||img.equals("tower3.gif")||img.equals("tower4.gif")||img.equals("tower5.gif")||img.equals("start.gif"))
                {
                    
                }
                else if(img.equals("alien.gif")&&left!=null&&left.equals("tower1.gif"))
                {
                    if(left.equals("tower1.gif"))
                    {
                        int h=t1.getHealthT();
                        t1.setHealthT(h-1);
                        if(t1.getHealthT()==0)
                        {
                            grid.setImage(new Location(r,c-1), null);
                            
                        }
                    }
                }
                else
                {
                    
                        grid.setImage(new Location(r, c-1), img);
                        grid.setImage(new Location(r,c), null);
                    
                }
            }
        }
      
        for(int c =0; c<grid.getNumCols();c++)
        {
            
            if(new Location(1, c)!=null&&new Location(1, c).equals("alien.gif"))
            {
                if(new Location(1, c-1).equals("tower.gif"))
                {
                    int h=t1.getHealthT();
                        t1.setHealthT(h-1);
                        if(t1.getHealthT()==0)
                        {
                            grid.setImage(new Location(1,c-1), null);
                            
                        }
                }
            }
        }
  }*/
  public void attackAliensR1()
  {
      int countTower = 0;
      int totalDmg=0;
      Alien a = new Alien();
      for(int c=1; c<grid.getNumCols();c++)
      {
          String img = grid.getImage(new Location(1,c));
          if(img!=null&&img.equals("tower1.gif"))
          {
              countTower++;
              totalDmg += 1;
          }
      }
      
      for(int c=1; c<grid.getNumCols();c++)
      {
          String img = grid.getImage(new Location(1,c));
          if(img!=null&&img.equals("alien.gif"))
          {
              System.out.println("we shooting");
              a.setHealth(a.getHealth()-totalDmg);
              System.out.println("alienH = "+ a.getHealth());
              if(a.getHealth()<=0)
              {
                  System.out.println("alien dead");
                  grid.setImage(new Location(1,c), null);
              }
             
          }
     }
      
      
      
  }
  //YOU ARE GOING TO MAKE 5 METHODS THAT MOVES EACH ROW INDEPENDENTLY
  public void moveRow1Left()
  {
        Tower t1 = new Tower(0, 2, 0, "tower1.gif");
        Tower t2 = new Tower(0, 3, 1, "tower2.gif");
        Tower t3 = new Tower(0, 4, 2, "tower3.gif");
        Tower t4 = new Tower(0, 5, 3, "tower4.gif");
        Tower t5 = new Tower(0, 6, 4, "tower5.gif");
      for(int c =1; c<grid.getNumCols();c++)
      {
                String img = grid.getImage(new Location(1,c));
                String left= grid.getImage(new Location (1, c-1));
                if(img==null||img.equals("crown.gif")||img.equals("tower1.gif")||img.equals("tower2.gif")||img.equals("tower3.gif")||img.equals("tower4.gif")||img.equals("tower5.gif")||img.equals("start.gif"))
                {
                    
                }
                else if(img.equals("alien.gif")&&left!=null&&left.equals("tower1.gif"))
                {
                    if(left.equals("tower1.gif"))
                    {
                        while(left!=null)
                        {
                            
                            int h=t1.getHealthT();
                            h--;
                            t1.setHealthT(h);
                            System.out.println(h);
                            if(h==0)
                            {
                                System.out.println("got in");
                                grid.setImage(new Location(1, c-1), null);

                            }
                            left=grid.getImage(new Location(1,c-1));
                        
                        }
                        
                    }
                }
                else
                {
                    
                        grid.setImage(new Location(1, c-1), img);
                        grid.setImage(new Location(1,c), null);
                    
                }
      }
  }
  public void moveRow2Left()
  {
        Tower t1 = new Tower(0, 2, 0, "tower1.gif");
        Tower t2 = new Tower(0, 3, 1, "tower2.gif");
        Tower t3 = new Tower(0, 4, 2, "tower3.gif");
        Tower t4 = new Tower(0, 5, 3, "tower4.gif");
        Tower t5 = new Tower(0, 6, 4, "tower5.gif");
      for(int c =1; c<grid.getNumCols();c++)
      {
                String img = grid.getImage(new Location(2,c));
                String left= grid.getImage(new Location (2, c-1));
                if(img==null||img.equals("crown.gif")||img.equals("tower1.gif")||img.equals("tower2.gif")||img.equals("tower3.gif")||img.equals("tower4.gif")||img.equals("tower5.gif")||img.equals("start.gif"))
                {
                    
                }
                else if(img.equals("alien.gif")&&left!=null&&left.equals("tower1.gif"))
                {
                    if(left.equals("tower1.gif"))
                    {
                       while(left!=null)
                        {
                            
                            int h=t1.getHealthT();
                            h--;
                            t1.setHealthT(h);
                            System.out.println(h);
                            if(h==0)
                            {
                                System.out.println("got in");
                                grid.setImage(new Location(2, c-1), null);

                            }
                            left=grid.getImage(new Location(2,c-1));
                        
                        }
                    }
                }
                else
                {
                    
                        grid.setImage(new Location(2, c-1), img);
                        grid.setImage(new Location(2,c), null);
                    
                }
      }
  }
  public void moveRow3Left()
  {
        Tower t1 = new Tower(0, 2, 0, "tower1.gif");
        Tower t2 = new Tower(0, 3, 1, "tower2.gif");
        Tower t3 = new Tower(0, 4, 2, "tower3.gif");
        Tower t4 = new Tower(0, 5, 3, "tower4.gif");
        Tower t5 = new Tower(0, 6, 4, "tower5.gif");
      for(int c =1; c<grid.getNumCols();c++)
      {
                String img = grid.getImage(new Location(3,c));
                String left= grid.getImage(new Location (3, c-1));
                if(img==null||img.equals("crown.gif")||img.equals("tower1.gif")||img.equals("tower2.gif")||img.equals("tower3.gif")||img.equals("tower4.gif")||img.equals("tower5.gif")||img.equals("start.gif"))
                {
                    
                }
                else if(img.equals("alien.gif")&&left!=null&&left.equals("tower1.gif"))
                {
                    if(left.equals("tower1.gif"))
                    {
                        while(left!=null)
                        {
                            
                            int h=t1.getHealthT();
                            h--;
                            t1.setHealthT(h);
                            System.out.println(h);
                            if(h==0)
                            {
                                System.out.println("got in");
                                grid.setImage(new Location(3, c-1), null);

                            }
                            left=grid.getImage(new Location(3,c-1));
                        
                        }
                    }
                }
                else
                {
                    
                        grid.setImage(new Location(3, c-1), img);
                        grid.setImage(new Location(3,c), null);
                    
                }
      }
  }
  public void moveRow4Left()
  {
        Tower t1 = new Tower(0, 2, 0, "tower1.gif");
        Tower t2 = new Tower(0, 3, 1, "tower2.gif");
        Tower t3 = new Tower(0, 4, 2, "tower3.gif");
        Tower t4 = new Tower(0, 5, 3, "tower4.gif");
        Tower t5 = new Tower(0, 6, 4, "tower5.gif");
      for(int c =1; c<grid.getNumCols();c++)
      {
                String img = grid.getImage(new Location(4,c));
                String left= grid.getImage(new Location (4, c-1));
                if(img==null||img.equals("crown.gif")||img.equals("tower1.gif")||img.equals("tower2.gif")||img.equals("tower3.gif")||img.equals("tower4.gif")||img.equals("tower5.gif")||img.equals("start.gif"))
                {
                    
                }
                else if(img.equals("alien.gif")&&left!=null&&left.equals("tower1.gif"))
                {
                    if(left.equals("tower1.gif"))
                    {
                       while(left!=null)
                        {
                            
                            int h=t1.getHealthT();
                            h--;
                            t1.setHealthT(h);
                            System.out.println(h);
                            if(h==0)
                            {
                                System.out.println("got in");
                                grid.setImage(new Location(4, c-1), null);

                            }
                            left=grid.getImage(new Location(4,c-1));
                        
                        }
                    }
                }
                else
                {
                    
                        grid.setImage(new Location(4, c-1), img);
                        grid.setImage(new Location(4,c), null);
                    
                }
      }
  }
  public void moveRow5Left()
  {
        Tower t1 = new Tower(0, 2, 0, "tower1.gif");
        Tower t2 = new Tower(0, 3, 1, "tower2.gif");
        Tower t3 = new Tower(0, 4, 2, "tower3.gif");
        Tower t4 = new Tower(0, 5, 3, "tower4.gif");
        Tower t5 = new Tower(0, 6, 4, "tower5.gif");
      for(int c =1; c<grid.getNumCols();c++)
      {
                String img = grid.getImage(new Location(5,c));
                String left= grid.getImage(new Location (5, c-1));
                if(img==null||img.equals("crown.gif")||img.equals("tower1.gif")||img.equals("tower2.gif")||img.equals("tower3.gif")||img.equals("tower4.gif")||img.equals("tower5.gif")||img.equals("start.gif"))
                {
                    
                }
                else if(img.equals("alien.gif")&&left!=null&&left.equals("tower1.gif"))
                {
                    if(left.equals("tower1.gif"))
                    {
                        while(left!=null)
                        {
                            
                            int h=t1.getHealthT();
                            h--;
                            t1.setHealthT(h);
                            System.out.println(h);
                            if(h==0)
                            {
                                System.out.println("got in");
                                grid.setImage(new Location(5, c-1), null);

                            }
                            left=grid.getImage(new Location(5,c-1));
                        
                        }
                    }
                }
                else
                {
                    
                        grid.setImage(new Location(5, c-1), img);
                        grid.setImage(new Location(5,c), null);
                    
                }
      }
  }
  
  public void handleCollision(Location loc)
  {
      if(grid.getImage(loc)==null)
      {
          
      }
      else if(grid.getImage(loc).equals("get.gif"))
      {
          timesGet++;
          grid.setImage(loc, null);
      }
      else
      {
          timesAvoid++;
          grid.setImage(loc, null);
      }
  }
  
  public int getScore()
  {
    return timesGet-timesAvoid;
  }
  public int getLevel()
  {
      return level;
  }
  
  public void updateTitle()
  {
    grid.setTitle("seconds: " + msElapsed/1000);
  }
  
  public boolean isGameOver()
  {
      if(getScore()==-5)
          return true;
      else
        return false;
  }
  
  public static void test()
  {
    Game game = new Game();
    game.play();
  }
  

  
  public static void main(String[] args)
  {
    Game.test();
  }
}