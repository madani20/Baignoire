package baignoire;

/**
 * La classe <b>Baignoire</b> est centrale. Elle étends la classe <u>Thread</u>.
 *  
 * <p>La baignoire reçoit de l'eau par le robinet et est aussi affectée d'une fuite d'eau.
 * Le volume d'eau de la baignoire augmente par l'utilisation de la méthode <i>debiter()</i>,
 * et diminue par la méthode <i>fuite()</i>.
 * A l'instanciation de la classe Baignoire, le volume d'eau est à 0, et le volume maximum à 1000.
 *  
 *  
 * 
 * 
 */

public class Baignoire extends Thread {
	
	/**
	 * Limite maximum de la contenance de la baignoire.
	 */
	public static final int maximum=1000;
	/**
	 * Instance de la classe Eau. Son contructeur prend un paramètre 'int' correspondant à une quantité d'eau. 
	 * Initialement cellei-ci est de 0.
	 */
	public static Eau contenu=new Eau(0);
	
	/**
	 * Méthode static qui simule la fuite d'une certaine quantité d'eau. Cette quantité d'eau impacte directement 
	 * le volume d'eau total de la baignoire.
	 * @param quantite
	 */
	public void fuite(int quantite ){
		for(int i=0;i<100;i++){
			if(Baignoire.contenu.volume <= 0){
				System.out.println("La baignore est vide. On commence à colmater la fuite.");
				break;
			}
			else if(Baignoire.contenu.volume >= Baignoire.maximum){
				//System.out.println("Baignoire pleine. On ne veut pas qu'elle déborde!");
				break;
			}
			else{
				Baignoire.contenu.volume-=quantite;
				System.out.println("Fuite, contenu de la baignoire : " + Baignoire.contenu.volume + "  " +this.getState());
				//Thread.yield();				
			}
		}
	}
	/**
	 * Lance la méthode 'fuite()'.
	 */
	public void run(){
		fuite(20);
	}
}
