/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medlemsprojektet;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author jpn
 */
public class Start {

    private static InfDB idb;    
    
    public static void main(String[] args) {
        try {
            idb = new InfDB("MedlemsDBMySQL", "3306", "MedlemsDBMySQL", "medlemskey");
            System.out.println("funka");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }

        new HuvudFonster(idb).setVisible(true);
    }
    
}
