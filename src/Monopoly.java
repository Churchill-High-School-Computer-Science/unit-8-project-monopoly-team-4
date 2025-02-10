import javax.swing.SwingUtilities;
 
public class Monopoly {
    public static void main(String[] args) {
 
        Board b = new Board();
        Player player1 = new Player("Jimmy");
        Player player2 = new Player("Joseph");
        Player player3 = new Player("Carlos");
        Player player4 = new Player("Grace");
        Display.players.add(player1);
        Display.players.add(player2);
        Display.players.add(player3);
        Display.players.add(player4);
        
 
        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
        while (true){
            player1.getDice();
            player1.moveLocation();
            player1.getProperty();
            player2.getDice();
            player2.moveLocation();
            player2.getProperty();
            player3.getDice();
            player3.moveLocation();
            player3.getProperty();
            player4.getDice();
            player4.moveLocation();
            player4.getProperty();
            
        }
        
    }
}