import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class ToetsModel  
{
    private ToetsWorld w;
    
   private Vraag[] vragen = {new Vraag("Boom","Boom.png"),new Vraag("Aap","Aap.png"),new Vraag("Hond","Hond.png"),new Vraag("Kat","Kat.png"), new Vraag("Maan","Maan.png"),new Vraag("Huis","Huis.png"),
       new Vraag("Roos","Roos.png"),new Vraag("Vis","Vis.png"),new Vraag("Sok","Sok.png"),new Vraag("Pen","Pen.png")};
    public ToetsModel(ToetsWorld w)
    {
        this.w = w;
    }
    public Vraag getVragen()
    {
        int j=0;
        for(int i=0; i<10; i++)
        {
            vragen[i].getVraag();
            j++;
        }
        return vragen[1];
    }
    public String getImages(int i)
    {
           String img;
           img = vragen[i].getImg();
           return img;
           
    }

}
