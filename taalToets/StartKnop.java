import greenfoot.*;

public class StartKnop extends Actor
{
    public StartKnop()
    {
        this.setImage("images/Start.png");
    }
    
    public boolean isSelected()
    {
       if (Greenfoot.mouseClicked(this))
       {
           return true;           
       }
       else
       {
           return false;
       }
    }
}
