/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaballik;

/**
 *
 * @author pyanetfl
 */
public class Plateau {
    static int normal = 0;
    static int variante = 1;
    
    public int largeur;
    public int hauteur;
    public Case[][] terrain;
    
    public Plateau(){
        largeur = 7;
        hauteur = 7;
        initialiserTerrain(0);
    }
    
    public Plateau(int mode){
        largeur = 7;
        hauteur = 7;
        initialiserTerrain(mode);
    }
    
    public Plateau(int l, int h, int mode){
        largeur = l;
        hauteur = h;
        initialiserTerrain(mode);
    }

    private void initialiserTerrain(int mode) {
        terrain = new Case[largeur][hauteur];
        if(mode == 0){
            for(int i=0;i<largeur;i++){
                if(i==((largeur-1)/2)){
                    terrain[0][i] = Case.BILLE_SUR_SUPPORT_BLANC;
                }else{
                    terrain[0][i] = Case.SUPPORT_BLANC;
                }
            }
            for(int i=0;i<largeur;i++){
                if(i==((largeur-1)/2)){
                    terrain[hauteur-1][i] = Case.BILLE_SUR_SUPPORT_NOIR;
                }else{
                    terrain[hauteur-1][i] = Case.SUPPORT_NOIR;
                }
            }
        }else{
            for(int i=0;i<largeur;i++){
                if(i==((largeur-1)/2)){
                    terrain[0][i] = Case.BILLE_SUR_SUPPORT_BLANC;
                }else{
                    if(i%2==1){
                       terrain[0][i] = Case.SUPPORT_NOIR;
                    }else{
                       terrain[0][i] = Case.SUPPORT_BLANC; 
                    }
                    
                }
            }
            for(int i=0;i<largeur;i++){
                if(i==((largeur-1)/2)){
                    terrain[hauteur-1][i] = Case.BILLE_SUR_SUPPORT_NOIR;
                }else{
                    if(i%2==1){
                       terrain[hauteur-1][i] = Case.SUPPORT_BLANC;
                    }else{
                       terrain[hauteur-1][i] = Case.SUPPORT_NOIR; 
                    }
                }
            }
        }
        
        for(int i=1;i<hauteur-1;i++){
            for(int j=0;j<largeur;j++){
                terrain[i][j] = Case.LIBRE;
            }
        }
    }
    
    public void Deplacer(Point p1,Point p2){
        terrain[p1.x][p1.y] = terrain[p2.x][p2.y];
    }
    public boolean DeplacementPossible(Point p1,Point p2,int nombreDeplacement){
        return true;
    }
    public void Afficher(){
        for(int i=0;i<hauteur;i++){
            for(int j=0;j<largeur;j++){
                System.out.print(terrain[i][j].contenu);
            }
            System.out.println();
        }
    }
    
}
