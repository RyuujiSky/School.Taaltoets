import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class ToetsView  
{
    // instance variables - replace the example below with your own
    private ToetsWorld w;
    

    
    public ToetsView(ToetsWorld w)
    {
        this.w = w;
    }

    private void wisScherm()
    {
        List<Actor> actors = this.w.getObjects(null);
        this.w.removeObjects(actors);
    }

    public void toonStartScherm(StartKnop knop,Logo logo)
    {
        this.wisScherm();
        this.w.addObject(new Text("Vul je naam in en klik daarna op Toets starten"),(int)this.w.getWidth()/2+50, 250);
        this.w.addObject(knop, this.w.getWidth()/2,this.w.getHeight()/2+150);
        this.w.addObject(logo, this.w.getWidth()/2,this.w.getHeight()/2-200);
        
    }
    
    public void toonToetsScherm(Klok klok)
    {
        this.wisScherm();
        this.w.addObject(klok,750,50);
    }
    
    public void toonEindScherm()
    {
        this.wisScherm();
        this.w.addObject(new Text("test"),(int)this.w.getWidth()/2+50, 250);
    }
    
    public void toonPlaatjes(String naam,int x,int y)
    {
        this.w.addObject(new Kaart("images/kaart/"+naam),x,y);
    }
    
    public void toonWoord(String naam)
    {
        this.w.addObject(new Text(naam),(int)this.w.getWidth()/2,(int)this.w.getHeight()/2);
    }
}
