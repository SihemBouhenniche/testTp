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

    /**
     * constructeur vide
     */
    public VectorHelper() {
    }
    
    //le constructeur avec paramétres

    /**
     * 
     * @param taille
     * @param tabElement
     */
    public VectorHelper(int taille, int[] tabElement) {
        this.taille = taille;
        this.tabElement = tabElement;
    }

   //algorithme de tri 

    /**
     * algorithme de tri par transposition
     */
    public void triTransposition(){
        int permute=0;
        if(this.tabElement != null){
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
  
    //la somme des deux vecteur

    /**
     * la somme de deux vectuers
     * @param tab
     * @param taille
     * @return
     * @throws DiffrenteTailleException
     */
    public int[] sommeVecteur(int[] tab,int taille) throws DiffrenteTailleException{
        int[] resultatTab = null;
        if(taille != this.taille) throw new DiffrenteTailleException();
        else{
            for (int i = 0; i < taille; i++) {
                resultatTab[i]=this.tabElement[i]+tab[i];
            }
        }
        return resultatTab;     
    }
}
