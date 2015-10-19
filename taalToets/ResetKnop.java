import greenfoot.*;

public class ResetKnop extends Actor
{
    public ResetKnop()
    {
        this.setImage("images/Restart.png");
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
