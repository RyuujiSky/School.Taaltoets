import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class ToetsView  
{
    // instance variables - replace the example below with your own
    private ToetsWorld w;
    private String n;
    private int teller = 0;
    private int t = 1;
    
    private Kaart[] kaarten = new Kaart[10];

    public ToetsView(ToetsWorld w)
    {
        this.w = w;
        
        for(int i=0; i<10; i++)
        {
           kaarten[i]=new Kaart("images/kaart/"+"hond"+".png");
        }
        java.util.Collections.shuffle(java.util.Arrays.asList(kaarten));
    }

    private void wisScherm()
    {
        List<Actor> actors = this.w.getObjects(null);
        this.w.removeObjects(actors);
    }

    public void toonStartScherm(StartKnop knop,Logo logo)
    {
        this.wisScherm();
        this.w.addObject(new Text("Druk op toets Starten"),(int)this.w.getWidth()/2, 250);
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
    
    public void toonPlaatjes()
    {
        this.w.addObject(kaarten[0].getImg(),175,100);
        this.w.addObject(kaarten[1],325,100);
        this.w.addObject(kaarten[2],475,100);
        this.w.addObject(kaarten[3],625,100);
        this.w.addObject(kaarten[4],100,300);
        this.w.addObject(kaarten[5],700,300);
        this.w.addObject(kaarten[6],175,500);
        this.w.addObject(kaarten[7],325,500);
        this.w.addObject(kaarten[8],475,500);
        this.w.addObject(kaarten[9],625,500);
    }
    
    public void toonWoord(Text woord)
    {
        //this.w.addObject(new Text(naam,100),(int)this.w.getWidth()/2,(int)this.w.getHeight()/2);
        w.addObject(woord,(int)this.w.getWidth()/2,(int)this.w.getHeight()/2);
    }

}
