/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author villavanhem
 */
public class Sökning {
    
    
    
    public ArrayList<Alien> sokAllaAliensPlats (String plats){
            
        ArrayList<Alien> aliens = new ArrayList<>();    
        String query = "SELECT namn FROM Alien join plats on alien.plats = Plats_ID where benamning = '" + plats + "'";
        String svar = idb.fetchSingle(query);
        return svar;
    }
    
    public String sokAllaAliensRas (String ras) {
        String query = "select namn from alien join" + ras + " on " + ras + ".Alien_ID = alien.Alien_ID;";
        String svar = idb.fetchSingle(query);
        return svar;
    }
    
    public String sokAllaAliensRegDatum(String datum1, String datum2) {
        String query = "select namn, registreringsdatum from alien where registreringsdatum between '"+datum1+"' and '"+ datum2 +"'";
        String svar = idb.fetchSingle(query);
        return svar;
    }
    
    public ArrayList<Alien> sokInfoOmAllaAliens() {
        String query = "select * from alien where alien_id ="
    
    }
    
}
