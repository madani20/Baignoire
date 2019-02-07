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
				 
		
		Baignoire baignoire=new Baignoire();
		Robinet robinet=new Robinet();
		
		//robinet.setPriority(Thread.MAX_PRIORITY);
		robinet.start();
		baignoire.start();
	}

}
