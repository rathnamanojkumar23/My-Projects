/**
 * 
 */
package emailapp;

/**
 * @author r.m.k.reddy
 *
 */
public class EmailApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em = new Email("King", "George");
		em.setMailBoxCapacity(250);
		em.setAlternativeEmail("kingGeorge123@gmail.com");
		
		System.out.println(em.showInfo());
		
		
	}

}
