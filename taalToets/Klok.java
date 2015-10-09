import greenfoot.*;
import java.awt.*;

public class Klok extends Actor
{
    private static final int STARTING_TIME = 300;
    private int seconds = STARTING_TIME;
    private long startTimeMillis;
    private boolean count = false;
    
    public Klok() 
    {
        getImage().clear();
        getImage().scale(130, 70);
    }
    
    public boolean isTijdVoorbij()
    {
        return this.seconds<0;                
    }
    
    private void berekenTijd()
    {
        if (count) {
            int tijdVoorbij=(int)((System.currentTimeMillis() - startTimeMillis)/1000);
            this.seconds=STARTING_TIME-tijdVoorbij;
           
           
        }
    }
    
     public void toonTijd() 
    {
        berekenTijd();
        int min = (int) (seconds / 60);
        int sec = seconds % 60;
        String remainingTime;
        if (sec < 10) {
            remainingTime = min+":0"+sec;
        }
        else {
            remainingTime = min+":"+sec;
        }
        getImage().setColor(Color.white);
        getImage().fill();
        GreenfootImage text = new GreenfootImage("Tijd over:", 20, Color.black, new Color(0, 0, 0, 0));
        GreenfootImage time = new GreenfootImage(remainingTime, 30, Color.black, new Color(0, 0, 0, 0));
        getImage().drawImage(text, (getImage().getWidth()/2)-(text.getWidth()/2), 5);
        getImage().drawImage(time, (getImage().getWidth()/2)-(time.getWidth()/2), 20);
    }
     
    public void startKlok() {
        this.startTimeMillis = System.currentTimeMillis();
        count = true;
    }
    
    public void stopKlok() {
       // timeSaved = System.currentTimeMillis() - startCurrentSecond;
        count = false;
    }
    
    public void resetKlok() {
        seconds = STARTING_TIME;
    }
}
