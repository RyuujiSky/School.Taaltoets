import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class ToetsView  
{
    // instance variables - replace the example below with your own
    private ToetsWorld w;
    private Plaatje[] plaatjes = new Plaatje[10];
    
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
        this.w.addObject(new Text("Druk op toets Starten"),(int)this.w.getWidth()/2, 250);
        this.w.addObject(knop, this.w.getWidth()/2,this.w.getHeight()/2+150);
        this.w.addObject(logo, this.w.getWidth()/2,this.w.getHeight()/2-200);
    }
    
    public void toonToetsScherm(Klok klok)
    {
        this.wisScherm();
        this.w.addObject(klok,750,50);
    }
    
    public void toonEindScherm(Vraag[] vragen, ResetKnop knop,Logo logo)
    {
        int h=100;
        int t=1;
        int cijfer=0;
        String res;
        this.wisScherm();
        this.w.addObject(new Text("vraag "),200,75);
            this.w.addObject(new Text("gegeven antwoord"),350,75);
            this.w.addObject(new Text("juiste antwoord"),500,75);
            this.w.addObject(new Text("resultaat"),650,75);
            this.w.addObject(new Text("-----------------------------------------------------------------------------------------------------------------------------------------------"),(int)this.w.getWidth()/2,85);
        for(int i=0; i<10; i++)
        {
            if(vragen[i].isGoed()==true)
            {
                res = "✔";
                cijfer++;
            }
            else
            {
                res = "✘";
            }
            this.w.addObject(new Text("vraag "+t),200,h);
            this.w.addObject(new Text(vragen[i].getAntwoord()),350,h);
            this.w.addObject(new Text(vragen[i].getVraag()),500,h);
            this.w.addObject(new Text(res),650,h);
            h = h+25;
            t++;
        }
        this.w.addObject(new Text("Cijfer: "+cijfer), this.w.getWidth()/2,350);
        this.w.addObject(new Text("-----------------------------------------------------------------------------------------------------------------------------------------------"),(int)this.w.getWidth()/2,335);
        this.w.addObject(knop, this.w.getWidth()/2,500);
        this.w.addObject(logo, this.w.getWidth()/2+300,500);
    }
    
    public void toonPlaatjes(Vraag[] vragen)
    {
        for(int i=0; i<10; i++)
        {
           plaatjes[i]=new Plaatje(vragen[i].getVraag());
        }
        java.util.Collections.shuffle(java.util.Arrays.asList(plaatjes));
        
        this.w.addObject(plaatjes[0],175,100);
        this.w.addObject(plaatjes[1],325,100);
        this.w.addObject(plaatjes[2],475,100);
        this.w.addObject(plaatjes[3],625,100);
        this.w.addObject(plaatjes[4],100,300);
        this.w.addObject(plaatjes[5],700,300);
        this.w.addObject(plaatjes[6],175,500);
        this.w.addObject(plaatjes[7],325,500);
        this.w.addObject(plaatjes[8],475,500);
        this.w.addObject(plaatjes[9],625,500);
    }
    
    public void toonVraag(Text woord)
    {
        w.addObject(woord,(int)this.w.getWidth()/2,(int)this.w.getHeight()/2);
    }
    
    public String getPlaatje()
    {
        for(int i=0; i<10; i++)
        {
            if(plaatjes[i].isSelected())
            {
                return plaatjes[i].getWoord();
            }
        }
        return "";
    }

}
