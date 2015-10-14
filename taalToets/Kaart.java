import greenfoot.*;

public class Kaart extends Actor
{
    private String img;
    
  public Kaart(String image)
  {
    this.img = image;
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
  
  public String getImg()
  {
      return this.img;
  }
}
