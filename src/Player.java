
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
    public void getProperty(){
         Property temp =  Board.propertiesMap.get(location);
        

         if (temp.cost > money){
            Display.inform("You are not able to buy this property.");
         }
         if (temp.alreadyBought == true){
            Display.inform("This property you cannot buy. Someone already owns it.");
         }
         if ((temp.ownable == true) && (money >= temp.cost)){
           int choice = Display.choice("Buy?","This property is up for sale. Buy or pass or rent?",new String[]{"Rent","Pass","Buy"});
            if (choice == 0){
                Display.inform("You are now renting this property");
                money -= temp.rent;
            }
            if (choice == 1){
                Display.inform("Passing this property");
            }
            if (choice == 2){
                Display.inform("Buying this property. You are now able to buy houses. However only up to 5. ");
                property.add(temp);
                money -= temp.cost;
             int numHouses = Display.choice("Buy Houses?","How many houses would you like to buy",new String[]{"1","2","3","4"});
                if (numHouses == 0){
                    money -= temp.houseCost;
                }
                if (numHouses == 1){
                    money -= temp.houseCost * 2;
                }
                if (numHouses == 2){
                    money -= temp.houseCost * 3;
                }
                if (numHouses == 3){
                    money -= temp.houseCost * 4;
                }
                
            }
            
         }
         

         }
        
    }
   



    

