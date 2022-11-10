package entity.motionless;

import entity.Permeability;
import entity.Sprite;

/**
 * @author JUNIOR MABAYA
 *
 */
public class Background extends MotionlessElement{
	
	/** La Constante SPRITE. */
    private static final Sprite SPRITE = new Sprite('.', "Background.png");

    /**
     * Instantiation d'un nouveau background.
     */
    Background() {
        super(SPRITE, Permeability.WALKABLE);
    }

}