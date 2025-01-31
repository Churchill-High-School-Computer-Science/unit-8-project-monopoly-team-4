
import java.util.ArrayList;

public class Player {

   int money = 2000;
   int location = 0;
   String name;
   ArrayList<Property> property = new ArrayList<>();
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
    public class Player2 {
        int money = 5000;
        String name;
        int location = 0;
        ArrayList<Property> property = new ArrayList<>();
        public Player2(String n){
            name = n;
        }
        public String getName(){
            return name;
        }
        public int getMoney(){
            return money;
        }
        public int getLocation(){
            return location;
        }
        public ArrayList<Property> getProperties(){
            return property;
        }







    }
}
