/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaballik;

/**
 *
 * @author pyanetfl
 */
public class Diaballik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Plateau p1,p2,p3,p4;
        p1 = new Plateau();
        p2 = new Plateau(Plateau.normal);
        p3 = new Plateau(Plateau.variante);
        p4 = new Plateau(8,8,0);
        p1.Afficher();
        p2.Afficher();
        p3.Afficher();
        p4.Afficher();
        
    }
}
