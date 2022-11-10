package entity.motionless;

import entity.Permeability;
import entity.Sprite;

/**
 * @author JUNIOR MABAYA
 *
 */
class Wall extends MotionlessElement {

    /** La Constante SPRITE. */
    private static final Sprite SPRITE = new Sprite('#', "Wall.png");

    /**
     * Instantiation d'un nouveau mur.
     */
    Wall() {
        super(SPRITE, Permeability.WALL);
    }
}