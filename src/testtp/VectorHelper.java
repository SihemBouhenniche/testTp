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
    private int taille = 0;
    //attrinut 2 : les elements du tableau
    private int[] tabElement=new int[100];
    //
    private int max;
    //
    private int min;

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

    /**
     *récuperer la taille du tableau
     * @return
     */
    public int getTaille() {
        return taille;
    }

    /**
     *récuperer le tableau d'elements
     * @return
     */
    public int[] getTabElement() {
        return tabElement;
    }

    /**
     * recuperer le max 
     * @return
     */
    public int getMax() {
        return max;
    }

    /**
     *recuperer le min
     * @return
     */
    public int getMin() {
        return min;
    }

   //algorithme de tri 

    /**
     * algorithme de tri par transposition
     */
    public void triTransposition(){
        int permute=0;
        if(this.tabElement != null){
            for (int i = 0; i < this.taille-1; i++) {
                for (int j = 0; j < this.taille-i-1; j++) {
                    if(this.tabElement[j]>this.tabElement[j+1]){
                        permute = this.tabElement[j];
                        this.tabElement[j]=this.tabElement[j+1];
                        this.tabElement[j+1]=permute;
                    }
                }
            } 
        }else{
            System.out.println("Vecteur vide");
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
        int[] resultatTab = new int[taille];
        if(taille != this.taille) throw new DiffrenteTailleException();
        else{
            for (int i = 0; i < taille; i++) {
                resultatTab[i]=this.tabElement[i]+tab[i];
            }
        }
        return resultatTab;     
    }
    
    /**
     * la methode qui calcule simultanemant le max et le min 
     */
    public void maxETmin(){
        this.max=tabElement[0];
        this.min=tabElement[0];
        for (int i = 0; i < taille; i++) {
            if(this.max < tabElement[i])
                this.max = tabElement[i];
            if(this.min > tabElement[i])
                this.min = tabElement[i];
        }
    }
    
    /**
     *la méthode qui utilise une formule (la moyenne)
     * @return
     */
    public double moyenne() {
        double result =0;
        for (int i = 0; i < this.taille; i++) {
            result+=this.tabElement[i];
        }
        result=result/taille;
        return result;
    }
}

