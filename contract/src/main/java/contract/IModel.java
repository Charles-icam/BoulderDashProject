package contract;
import entity.IMap;
import entity.mobile.IMobile;

/**
 * <h1>L'interface IModelr</h1>
 * @author JUNIOR MABAYA
 *
 */

public interface IModel {
	
	

	/**
	 * obtenir la carte
	 */

	IMap getMap();
	

	/**
	 * Obtenir MonJoueur
	 */

    IMobile getMyPlayer();

}
