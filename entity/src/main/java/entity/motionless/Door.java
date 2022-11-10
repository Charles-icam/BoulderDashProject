package entity.motionless;

import entity.Permeability;
import entity.Sprite;

/**
 * @author JUNIOR MABAYA
 *
 */
public class Door extends MotionlessElement {
	
	    /** La Constante SPRITE. */
	    private static final Sprite SPRITE = new Sprite('D', "Door.png");

	    /**
	     * Instantiation d'un nouveau door.
	     */
	    Door() {
	        super(SPRITE, Permeability.EXIT);
	    }
	}