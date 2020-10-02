// Akhil Gogineni
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class ClimbingChallenge{
   
   public void climbMountainGoingLeft(Climber temp){
           temp.move();
           temp.move();
           temp.turnLeft();
           temp.move();
   }
   
   public void climbMountainGoingRight(Climber temp){
           temp.move();
           temp.move();
           temp.turnRight();
           temp.move();
   }
   
   public void climbDownMountainGoingRight(Climber temp){
           temp.turnRight();
           temp.move();
           temp.move();
           temp.turnLeft();
   }
   
   public void climbDownMountainGoingLeft(Climber temp){
           temp.turnLeft();
           temp.move();
           temp.move();
           temp.turnRight();
           
   }
   
   public static void main (String[] args) {
   
      Display.openWorld("maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(10);
        
         Climber hiker = new Climber(7);
      
      climbMountainGoingRight(hiker);
      climbDownMountainGoingRight(hiker);
      
      
 
      }
}