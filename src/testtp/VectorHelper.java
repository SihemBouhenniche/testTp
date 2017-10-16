/*
 * TP 1 IGL sur l'utilisation des outils de gestion des projets 'github , javadoc et
 *  le tests unitaires| class VectorHelper
 * 
 */
package testtp;

/**
 *
 * @author SihemBouhennoche
 */
public class VectorHelper {
    //attribut 1 : taille du tableau
    private int taille;
    //attrinut 2 : les elements du tableau
    private int[] tabElement;

    //le constructeur par deafut
    public VectorHelper() {
    }
    
    //le constructeur avec paramétres
    public VectorHelper(int taille, int[] tabElement) {
        this.taille = taille;
        this.tabElement = tabElement;
    }

   //algorithme de tri 
    public void triTransposition(){
        int permute=0;
        for (int i = 0; i < this.taille; i++) {
            for (int j = 0; j < this.taille-i; j++) {
                if(this.tabElement[j]>this.tabElement[j+1]){
                    permute = this.tabElement[j];
                    this.tabElement[j]=this.tabElement[j+1];
                    this.tabElement[j+1]=permute;
                }
            }
        }  
    }
  
    
    
}
