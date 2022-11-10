package contract;
import java.io.IOException;



/**
 * <h1>L'interface IOrderPerformer</h1>
 * @author JUNIOR MABAYA
 *
 */
public interface IOrderPerformer {
	

	/**
	 * Méthode orderPerform
	 */
	void orderPerform(UserOrder userOrder) throws IOException;

}

