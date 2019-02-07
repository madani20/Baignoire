package baignoire;


/**
 * La classe <b>Robinet</b> étends la classe <u>Thread</u>.
 * <p>
 * La fonction de cette classe est de fournir un certain débit d'eau par la méthode <i>debiter(int)</i>.
 * Elle impacte donc le volume total d'eau de la baignoire.
 * </p>
 * 
 * 
 * 
 * 
 */

public class Robinet extends Thread {
	
	//public static int debit;
	
	/**
	 * <p>Ajoute une quantite d'eau dans la baignoire, dans la limite du volume maximum du contenu de la baignoire
	 * qui est fixé initialement à 1000.</p>
	 * 
	 * @param quantite
	 */
	public void debiter(int quantite){
		
		for(int i=0;i<100;i++){
			if (Baignoire.contenu.volume < Baignoire.maximum){
			
				Baignoire.contenu.volume+=quantite;
				System.out.println("Remplissage, contenu de la baignoire : " + Baignoire.contenu.volume + " " + this.getState());
				//Thread.yield();
			}
			else {
				System.out.println("Baignoire enfin pleine.");
				break;
			}
		
		}
	}
	/**
	 * Cette méthode lance la méthode 'débiter' avec la paremètre indiqué.
	 */
	public void run(){
		debiter(50);
	}
}
