package entity.motionless;

import entity.Element;
import entity.Permeability;
import entity.Sprite;

/**
 * @author JUNIOR MABAYA
 *
 */
public class MotionlessElement extends Element {
	
	/**
     * Instantiation d'un nouveau élément immobile.
     *
     * @param sprite
     *            Le sprite
     * @param perméabilité
     *            La perméabilité
     */
    MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

}