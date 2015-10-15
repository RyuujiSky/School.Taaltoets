import greenfoot.*;

public class Kaart extends Actor
{
    private String img;
    private String voorvoegsel;
    private String achtervoegsel;
    
  public Kaart(String image)
  {
    this.img = image;
    this.voorvoegsel = "images/kaart/";
    this.achtervoegsel = ".png";
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
