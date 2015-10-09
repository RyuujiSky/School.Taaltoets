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
    }
    
    public void act()
    {
        switch(myToetsStatus)
        {
            case START:                   
                    reageerOpStart();
                    break;
            case PLAY:
                    reageerOpToonVragen();
                    reageerOpToonPlaatjes();
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
    
    public void reageerOpToonVragen()
    {
       myView.toonWoord("test");
    }
    
    public void reageerOpToonPlaatjes()
    {
        myView.toonPlaatjes(myModel.getImages(0),175,100);
        myView.toonPlaatjes(myModel.getImages(1),325,100);
        myView.toonPlaatjes(myModel.getImages(2),475,100);
        myView.toonPlaatjes(myModel.getImages(3),625,100);
        myView.toonPlaatjes(myModel.getImages(4),100,300);
        myView.toonPlaatjes(myModel.getImages(5),700,300);
        myView.toonPlaatjes(myModel.getImages(6),175,500);
        myView.toonPlaatjes(myModel.getImages(7),325,500);
        myView.toonPlaatjes(myModel.getImages(8),475,500);
        myView.toonPlaatjes(myModel.getImages(9),625,500);
    }
}
