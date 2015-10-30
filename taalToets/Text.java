import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

public class Text extends Actor
{
  private String text;
  private int size;
  private Color color;
  public Text(String t,int s)
  {
      this.text=t;
      this.size=s;
      this.color=Color.BLACK;
      updateImage();
  }
  
  public Text(String t)
  {
      this.text=t;
      this.size=20;
      this.color=Color.BLACK;
      updateImage();
  }
  
  public Text(String t,Color color)
  {
      this.text=t;
      this.size=20;
      this.color=color;
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
    GreenfootImage image = new GreenfootImage(this.text,this.size,this.color,null);
    image.setColor(color);
    setImage(image);
  }
  
  private void clearImage()
  {
      GreenfootImage image = new GreenfootImage(this.text,this.size,Color.BLACK,null);
      image.clear();
  }
}
