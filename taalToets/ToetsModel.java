import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class ToetsModel  
{
    private ToetsWorld w;
    
   private Vraag[] vragen = {new Vraag("Boom","Boom.png"),new Vraag("Aap","Aap.png"),new Vraag("Hond","Hond.png"),new Vraag("Kat","Kat.png"), new Vraag("Maan","Maan.png"),new Vraag("Huis","Huis.png"),
       new Vraag("Roos","Roos.png"),new Vraag("Vis","Vis.png"),new Vraag("Sok","Sok.png"),new Vraag("Pen","Pen.png")};
      
    private Vraag[] woorden = new Vraag[10];
    
    public ToetsModel(ToetsWorld w)
    {
        this.w = w;
        
        for(int i=0; i<10; i++)
        {
            woorden[i]=vragen[i];
        }
    }
    
    public String getVragen(int i)
    {
       String v;
       v=woorden[i].getVraag();
       return v;
    }
    
    public String getImages(int i)
    {
           String img;
           img = vragen[i].getImg();
           return img;           
    }
    
    public void shuffleArray()
    {
        java.util.Collections.shuffle(java.util.Arrays.asList(vragen));
        java.util.Collections.shuffle(java.util.Arrays.asList(woorden));
    }

}
