import greenfoot.*;

/**
 * Write a description of class Vraag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vraag
{
    private String vraag;
    private String antwoord;
    
    public Vraag(String v)
    {
        this.vraag=v;
        this.antwoord=this.antwoord;
    }
    
    public String getVraag()
    {
        return this.vraag;
    }
    
    public String getAntwoord()
    {
        if(this.antwoord == null)
        {
            return "";
        }
        else
        {
            return this.antwoord;
    
        }
    }
    
    public void zetAntwoord(String gegevenAntwoord)
    {
        this.antwoord = gegevenAntwoord;
    }
    
    public boolean isGoed()
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
    
}
