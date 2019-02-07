package baignoire;


/**
 * <b>Eau </b>est la classe qui fournit une quantitée d'eau.</>
 * <p>
 * Cet eau est utilisée dans la classe <b>Baignoire</> pour la remplir à l'aide de la méthode <i>debiter()</i>, 
 * ou la vider à l'aide de la méthode <i>fuite()</i>.
 * Son constructeur prend un paramètre de type int qui correspond à la quantité d'eau à utiliser
 * </p>
 *  
 *
 *  
 */

public class Eau {
	
	public static int volume;
	/**
	 * Constructeur de la classe Eau
	 * @param val
	 */
	public Eau(int val){
	volume=val;	
	}
	
}