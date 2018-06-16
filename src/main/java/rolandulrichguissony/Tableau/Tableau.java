package rolandulrichguissony.Tableau;

/*******************************
 * Calculs : simme et produit  *
 *******************************/

/************************************************************
 * ©2018 Roland Ulrich Guissony, All rights reserved        *
 * Java/Java EE developer                                   *
 * Paris Saclay University's Entrepreneur student           *
 * Electronic and Informatic Engineer                       *
 ************************************************************/

public class Tableau 
{
    public static void main( String[] args )
    {
    	/** Patie 1 */
    	//Déclaration
    	int[] mytab;
    	//Création
    	mytab = new int[5];
    	//Initialisation
    	mytab[0] = 1;
    	mytab[1] = 2;
    	mytab[2] = 3;
    	mytab[3] = 4;
    	mytab[4] = 5;
    	//Appel de méthode
    	int som = somme(mytab);
    	//Affichage
        System.out.println( "Somme : " + som );
        
    	/** Patie 2 */
    	//Déclaration, Création
    	int[] mytab2 = new int[5];
    	//Initialisation
    	mytab2[0] = 1;
    	mytab2[1] = 2;
    	mytab2[2] = 3;
    	mytab2[3] = 4;
    	mytab2[4] = 5;
    	//Appel de méthode et affichag
        System.out.println( "Somme : " + somme(mytab2));
        
    	/** Patie 3 */
    	//Déclaration, Création, Initialisation
    	int[] mytab3 = new int[]  {1, 2, 3, 4, 5};
    	//Appel de méthode et affichag
        System.out.println( "Produit : " + produit(mytab3));

    }
    public static int somme(int[] tab) {
    	int result = 0;
    	for (int i = 1; i < tab.length; i++) {
    		result = result + tab[i];
    	}
    	return result;
    }
    
    public static int produit(int[] tab) {
    	int result = 1;
    	for (int i = 1; i < tab.length; i++) {
    		result = result * tab[i];
    	}
    	return result;
    }


}
