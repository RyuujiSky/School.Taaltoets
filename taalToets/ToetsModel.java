import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class ToetsModel  
{
    private ToetsWorld w;
    
   private Vraag[] vragen = {new Vraag("Boom"),new Vraag("Aap"),new Vraag("Hond"),new Vraag("Kat"), new Vraag("Maan"),new Vraag("Huis"),
       new Vraag("Roos"),new Vraag("Vis"),new Vraag("Sok"),new Vraag("Pen")};
      
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
    
    public void shuffleArray()
    {
        java.util.Collections.shuffle(java.util.Arrays.asList(vragen));
        java.util.Collections.shuffle(java.util.Arrays.asList(woorden));
    }
    
  

}
