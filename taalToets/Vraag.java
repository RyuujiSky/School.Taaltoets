import greenfoot.*;

/**
 * Write a description of class Vraag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vraag extends Actor
{
    private String vraag;
    private String antwoord;
    private String img;
    
    public Vraag(String v,String p)
    {
        this.vraag=v;
        this.antwoord=this.antwoord;
        this.img=p;
    }
    
    public String getVraag()
    {
        return this.vraag;
    }
    
    public String getAntwoord()
    {
        return this.antwoord;
    }
    
    public void zetAntwoord(String gegevenAntwoord)
    {
        this.antwoord = gegevenAntwoord;
    }
    
    public boolean geefResultaat()
    {
        if (vraag.equals(antwoord))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public String getImg()
    {
        return this.img;
    }
   
}
