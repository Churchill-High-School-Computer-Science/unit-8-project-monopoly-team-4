import java.awt.Color;
 
public class Property {
 
    Color color;
    String name = "Short-Line";
    Player owner;
    int rent = 10;
    int houseCost = 100;
    String type = "Railroads";
    int setSize = 1000;
 
    int numHouses;
 
    public Property(Color c, String n, int r, int hc, String t, int s){
        color = c;
        name = n;
        rent = r;
        houseCost = hc;
        type = t;
        numHouses = 0;
        owner = null;
        setSize = s;
        houseCost = hc;
    }
 
    public Color getColor(){
        return color;
    }
 
    public String getName(){
        return name;
    }
 
    public int getNumHouses(){
        return numHouses;
    }
 
    public Player getOwner(){
        return owner;
    }
 
    public int getRent(){
 
        
        return rent;
    }
}