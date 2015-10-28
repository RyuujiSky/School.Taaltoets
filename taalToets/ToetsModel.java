import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class ToetsModel  
{
    private ToetsWorld w;
    
   private String[] woorden = {new String("Boom"),new String("Aap"),new String("Hond"),new String("Kat"), new String("Maan"),new String("Huis"),
       new String("Roos"),new String("Vis"),new String("Sok"),new String("Pen"),new String("Ball"),new String("Bank"),new String("Boek"),new String("Boer"),
       new String("Bos"),new String("Bus"),new String("Ei"),new String("Doos"),new String("Ui"),new String("Geit"),new String("Hand"),new String("Hout"),
       new String("IJs"),new String("Hut"),new String("Kaas"),new String("Jas"),new String("Licht"),new String("Koek"),new String("Muis"),
       new String("Neus"),new String("Oog"),new String("Raket"),new String("Ring"),new String("Strand"),new String("Tak"),new String("Uil"),new String("Vuur"),
       new String("Zeep"),new String("Zon")};
      
    private Vraag[] vragen = new Vraag[10];
    
    private int index= -1;
    public ToetsModel(ToetsWorld w)
    {
        this.w = w;
        java.util.Collections.shuffle(java.util.Arrays.asList(woorden));
        for(int i=0; i<10; i++)
        {
            vragen[i] = new Vraag(woorden[i]);
        }
        java.util.Collections.shuffle(java.util.Arrays.asList(vragen));
    }
    
    public Vraag[] getVragen()
    {
        return vragen;
    }
    
    public String getVolgendeVraag()
    {
            this.index++;
            return vragen[index].getVraag();
    }
    
    public boolean isVolgendeVraag()
    {
        if(index<9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void zetAntwoord(String woord)
    {
        vragen[index].zetAntwoord(woord);
        vragen[index].isGoed();
    }
}
