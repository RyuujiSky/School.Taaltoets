import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class ToetsModel  
{
    private ToetsWorld w;
    
   private Vraag[] vragen = {new Vraag("Boom","Boom.png"),new Vraag("Aap","Aap.png"),new Vraag("Hond","Hond.png"),new Vraag("Kat","Kat.png"), new Vraag("Maan","Maan.png"),new Vraag("Huis","Huis.png"),
       new Vraag("Roos","Roos.png"),new Vraag("Vis","Vis.png"),new Vraag("Sok","Sok.png"),new Vraag("Pen","Pen.png")};
      
    private Vraag[] woorden = new Vraag[10];
    private Kaart[] kaarten = new Kaart[10];
    
    public ToetsModel(ToetsWorld w)
    {
        this.w = w;
        
        for(int i=0; i<10; i++)
        {
            woorden[i]=vragen[i];
        }
        
        for(int i=0; i<10; i++)
        {
            kaarten[i]=new Kaart("images/kaart/"+vragen[i].getImg());
        }
    }
    
    public String getVragen(int i)
    {
       String v;
       v=woorden[i].getVraag();
       return v;
    }
    
    public Kaart getCard(int i)
    {
           return kaarten[i];           
    }
    
    public void shuffleArray()
    {
        java.util.Collections.shuffle(java.util.Arrays.asList(vragen));
        java.util.Collections.shuffle(java.util.Arrays.asList(woorden));
        java.util.Collections.shuffle(java.util.Arrays.asList(kaarten));
    }
    
    public void checkKaarten()
    {
            for(int i=0; i<10; i++)
            {
               if(kaarten[i].isSelected())
               {
                   System.out.println("click"+kaarten[i].getImg());
               }
            }
    }

}
