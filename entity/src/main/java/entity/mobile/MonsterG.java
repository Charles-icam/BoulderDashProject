package entity.mobile;

import entity.Permeability;
import entity.Sprite;

public class MonsterG extends Mobile{

	/** La Constante SPRITE. */
	private static final Sprite SPRITE = new Sprite('G', "greenMonster.png");

	/**
	 * Constructeur d'un nouveau monstre.
	 */
	public MonsterG() {
		super(SPRITE, Permeability.KILLABLE);
	}

	@Override
	public void win() {
		return;
	}

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