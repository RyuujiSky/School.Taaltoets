import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

public class Text extends Actor
{
  private String text;
  private int size;
  
  public Text(String t,int s)
  {
      this.text=t;
      this.size=s;
      updateImage();
  }
  
   public Text(String t)
  {
      this.text=t;
      this.size=20;
      updateImage();
  }
  
  public void setText(String t,int s)
  {
     this.text = t;
     this.size = s;
     updateImage();
  }
  
    public void setText(String t)
  {
     this.text = t;
     updateImage();
  }

  private void updateImage()
  {
    GreenfootImage image = new GreenfootImage(this.text,this.size,Color.BLACK,null);
    setImage(image);
  }
  
  private void clearImage()
  {
      GreenfootImage image = new GreenfootImage(this.text,this.size,Color.BLACK,null);
      image.clear();
  }
}
