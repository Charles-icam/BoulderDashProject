package entity.mobile;

import entity.Permeability;
import entity.Sprite;

/**
 * @author Junior Mabaya
 *
 */

public class MonsterR extends Mobile {

	/** La Constante SPRITE. */
	private static final Sprite SPRITE = new Sprite('R', "redMonster.png");

	/**
	 * Constructeur.
	 */
	public MonsterR() {
		super(SPRITE, Permeability.KILLABLE);
	}

	@Override
	public void win() {
		return;
	}

	/**
	 *Getter des diamonds
	 */
	@Override
	public int getDiamonds() {
		return 0;
	}

	/**
	 *Getter des diamonds
	 */
	@Override
	public void grabDiamond() {
		return;
	}
}