/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaballik;

/**
 *
 * @author pyanetfl
 */
enum Case {
    LIBRE(0),SUPPORT_BLANC(1),BILLE_SUR_SUPPORT_BLANC(2),SUPPORT_NOIR(3),
    BILLE_SUR_SUPPORT_NOIR(4);
    
    int contenu;
    
    Case(int i) {
        contenu = i; 
    }
    
}
