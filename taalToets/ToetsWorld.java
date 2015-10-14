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
    private Kaart myKaart;
    private int teller=0;
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
        myModel.shuffleArray();
    }
    
    public void act()
    {
        switch(myToetsStatus)
        {
            case START:                   
                    reageerOpStart();
                    break;
            case PLAY:
                    reageerOpKlok();
                  // if(())
                   //{
                  //     teller++;
                  //     woord.setText(myModel.getVragen(teller));
                  //     myView.toonWoord(woord);
                  // }
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
            reageerOpToonPlaatjes();
            reageerOpToonVragen();
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
        this.woord = new Text(myModel.getVragen(teller),100);
        myView.toonWoord(this.woord);
    }

    public void reageerOpToonPlaatjes()
    {
       myView.toonPlaatjes();
    }
}
