import greenfoot.*;
import java.util.*;

public class ToetsWorld extends World
{
    private Klok myKlok;
    private StartKnop myStartKnop;
    private ToetsStatus myToetsStatus;
    private ToetsView  myView;
    private Logo myLogoStart;
    private Logo myLogoEind;
    private ResetKnop myResetKnop;
    private ToetsModel myModel;
    private Plaatje myPlaatje;
    private Text woord;

    public ToetsWorld()
    {    
        super(800, 600, 1); 
        myKlok=new Klok();
        myStartKnop=new StartKnop();
        myResetKnop=new ResetKnop();
        myLogoStart=new Logo(250,200);
        myLogoEind=new Logo(150,100);
        myView = new ToetsView(this);
        myModel = new ToetsModel(this);
        this.myToetsStatus=ToetsStatus.START;
        this.myView.toonStartScherm(myStartKnop,myLogoStart);
        woord = new Text(myModel.getVolgendeVraag(),100);
    }
    
    public void act()
    {
        switch(myToetsStatus)
        {
            case START:                   
                    reageerOpStart();
                    break;
            case PLAY:
                    reageerOpklikPlaatje();
                    reageerOpKlok();
                    break;
            case END:  
                   reageerOpReset();
                    break;
            
        }      
    }
    
    public void reageerOpStart()
    {
        if(myStartKnop.isSelected())
        {
            this.myToetsStatus=ToetsStatus.PLAY;
            this.myView.toonToetsScherm(myKlok);
            this.myKlok.startKlok();          
            myView.toonPlaatjes(myModel.getVragen());
            myView.toonVraag(woord);
            myView.counter(myModel.getIndex());
        }
    }
    
    public void reageerOpKlok()
    {
        myKlok.toonTijd();
        if(myKlok.isTijdVoorbij())
        {
            Vraag[] vragen = myModel.getVragen();
            this.myToetsStatus=ToetsStatus.END;
            this.myView.toonEindScherm(vragen,myResetKnop,myLogoEind);
        }        
    }

    public void reageerOpklikPlaatje()
    {
        if(!myView.getPlaatje().equals(""))
        {
            Vraag[] vragen = myModel.getVragen();
            myModel.zetAntwoord(myView.getPlaatje());
            if(!myModel.isVolgendeVraag()==true)
            {
                this.myToetsStatus=ToetsStatus.END;
                this.myView.toonEindScherm(vragen,myResetKnop,myLogoEind);
                myView.counter(myModel.getIndex()+1);
            }
            else
            {
                woord.setText(myModel.getVolgendeVraag(),100);
                myView.counter(myModel.getIndex());
            }
        }
    }
    
    public void reageerOpReset()
    {
        if(myResetKnop.isSelected())
        {
            this.myToetsStatus=ToetsStatus.START;
            Greenfoot.setWorld(new ToetsWorld());
        }
    }
}
