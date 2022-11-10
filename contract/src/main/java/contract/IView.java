package contract;

import fr.exia.showboard.BoardFrame;


/**
 * <h1>L'interface IView</h1>
 * @author JUNIOR MABAYA
 *
 */
public interface IView {
	

	/**
	 * Méthode afficher message
	 */

	void displayMessage(final String message);
	
	/**
	 * Méthode suivre mon joueur
	 */
	void followMyPlayer();
		
	/**
	 * Méthode metre a jour la vue (View)
	 */
	void updateView();

	BoardFrame getBoardFrame();

}
