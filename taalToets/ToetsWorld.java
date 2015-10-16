import greenfoot.*;
import java.util.*;

public class ToetsWorld extends World
{
    private Klok myKlok;
    private StartKnop myStartKnop;
    private ToetsStatus myToetsStatus;
    private ToetsView  myView;
    private Logo myLogo;
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
        myLogo=new Logo();
        myView = new ToetsView(this);
        myModel = new ToetsModel(this);
        this.myToetsStatus=ToetsStatus.START;
        this.myView.toonStartScherm(myStartKnop,myLogo);
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
        }
    }
    
    public void reageerOpKlok()
    {
        myKlok.toonTijd();
        if(myKlok.isTijdVoorbij())
        {
            this.myToetsStatus=ToetsStatus.END;
            this.myView.toonEindScherm();
        }        
    }

    public void reageerOpklikPlaatje()
    {
        if(!myView.getPlaatje().equals(""))
        {
            myModel.zetAntwoord(myView.getPlaatje());
            if(!myModel.isVolgendeVraag()==true)
            {
                this.myToetsStatus=ToetsStatus.END;
                this.myView.toonEindScherm();
            }
            else
            {
                woord.setText(myModel.getVolgendeVraag(),100);
            }
        }
    }
    
    public void reageerOpReset()
    {
    
    }
}
