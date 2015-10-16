import greenfoot.*;

public class Plaatje extends Actor
{
    private String img;
    private String woord;
    
  public Plaatje(String woord)
  {
    this.img = "images/kaart/"+woord+".png";
    this.woord = woord;
    this.setImage(this.img);
  }

  public boolean isSelected()
  {
      if(Greenfoot.mouseClicked(this))
      {
          return true;
      }
      return false;
  }
  
  public String getWoord()
  {
      return this.woord;
  }
  
  public String getPlaatje()
  {
    return this.img;
  }
  
}
