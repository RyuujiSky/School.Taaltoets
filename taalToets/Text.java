import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

public class Text extends Actor
{
  private String text;
  
  public Text(String prefix)
  {
      this.text=prefix;
      updateImage();
  }
  
  public void setCaption(String caption)
  {
     text = caption;
     updateImage();
  }
    
  private void updateImage()
  {
      GreenfootImage image = new GreenfootImage((text.length()+2)*8,18);
      image.clear();
        
      image.setFont(new Font("Courier",Font.BOLD,14));
      image.setColor(Color.BLACK);
      image.drawString(text,1,14);
      this.setImage(image);
  }
}
