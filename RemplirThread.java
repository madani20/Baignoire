package baignoire;


/**
 * 
 *  <p>
 * Cette classe fournit les instances des deux classes qui étendent la classe <u>Thread</u>. C'est à dire nos deux classes Thread.
 * C'est ici que nos deux Threads sont lancés.
 * </p>
 * 
 *    
 * 
 */

public class RemplirThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				 
		
		Baignoire UneBaignoire=new Baignoire();
		Robinet unRobinet=new Robinet();
		
		//robinet.setPriority(Thread.MAX_PRIORITY);
		unRobinet.start();
		UneBaignoire.start();
	}

}
