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
            System.out.println("true");
            return true;
        }
        else
        {
            System.out.println("false");
            return false;
        }
        
    }
   
}
