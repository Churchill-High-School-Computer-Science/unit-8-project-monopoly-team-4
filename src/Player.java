
import java.util.ArrayList;


public class Player {

   int money = 2000;
   int location = 0;
   String name;
   ArrayList<Property> property = new ArrayList<>();
   int randomNum = (int)(Math.random() * 10);
   int randomMod;
   public Player(String n){
    name = n;
   }

    //TODO FIX
    public String getName(){
        return name;
    }

    ///TODO FIX
    public int getMoney(){
        return money;
    }

    //TODO FIX
    public ArrayList<Property> getProperties(){
        return property;
    }

    //TODO FIX
    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return location;
    }
    public void getDice(){
         Display.inform("It is " + getName() + "'s turn! \n " + getName() + " rolled " + randomNum + "!");
    }
    public void moveLocation(){
        location += randomNum;
        int movLoc = location;
        Display.inform(getName() + " moves to slot " + movLoc + "!");
        Display.boardPanel.repaint();
    }
   



    }

