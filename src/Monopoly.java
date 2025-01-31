import javax.swing.SwingUtilities;
 
public class Monopoly {
    public static void main(String[] args) {
 
        Board b = new Board();
        Player player1 = new Player("Jimmy");
        Display.players.add(player1);
 
        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
    }
}