
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

public class Start {
    private static InfDB idb;
    public static void main(String[] args) throws InfException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StartWindow startWindow = new StartWindow();
                startWindow.setVisible(true);
            }
        });
        
    
    try {
        idb = new InfDB("mibdb", "3360", "mibdba", "mibkey");
    
    } catch (InfException ex) {
        Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
    }

    } 
    }
}