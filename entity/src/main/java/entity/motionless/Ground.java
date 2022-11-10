package entity.motionless;

import entity.Permeability;
import entity.Sprite;

/**
 * @author JUNIOR MABAYA
 *
 */
public class Ground extends MotionlessElement{
	 /** LA Constante SPRITE. */
    private static final Sprite SPRITE = new Sprite(' ', "Ground.png");

    /**
     * Instantiation d'un nouveau terrain.
     */
    Ground() {
        super(SPRITE, Permeability.DIGGABLE);
    }

}