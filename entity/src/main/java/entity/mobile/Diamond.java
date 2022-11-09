package entity.mobile;

import entity.Permeability;
import entity.Sprite;

/**
 * <h1> The Diamond class</h1>
 * @author Junior Mabaya
 *
 */
public class Diamond extends Mobile{

	/** La Constante SPRITE. */
	private static final Sprite SPRITE = new Sprite('*', "diamond.png");


	/**
	 * Constructeur du Diamand.
	 */
	 public Diamond() {
		super(SPRITE, Permeability.DIAMOND);
	}


	@Override
	public void win() {
		// TODO Auto-generated method stub
		return;
	}

	/**
	 * Getter des diamonds
	 */
	@Override
	public int getDiamonds() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 *Obtenir les diamonds
	 */
	@Override
	public void grabDiamond() {
		return;
	}
}