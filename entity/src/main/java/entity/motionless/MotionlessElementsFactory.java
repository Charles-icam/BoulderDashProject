package entity.motionless;

/**
 * <h1>Une usine pour créer des objets MotionlessElements.</h1>
 *
 * @author JUNIOR MABAYA
 * @version 0.1
 */
public abstract class MotionlessElementsFactory {

	private static final Wall wall = new Wall();
	private static final Door door = new Door();
	private static final Background background = new Background();
	private static final Ground ground = new Ground();

	/**
	 * Les éléments sans mouvement sont un tableau de tous les MotionlessElement possibles.
	 */
	private static MotionlessElement[] motionlessElements = {wall, background, door, ground};

	/**
	 * crée le mur
	 * @return
	 */
	public static MotionlessElement createWall() {
		return wall;
	}

	/**
	 * crée la porte
	 * @return
	 */
	public static MotionlessElement createDoor() {
		return door;
	}

	/**
	 * crée l'arriere plan
	 * @return
	 */
	public static MotionlessElement createBackground() {
		return background;
	}
	
	/**
	 * 
	 * crée le terrain
	 * @return
	 */
	public static MotionlessElement createGround() {
		return ground;
	}

	/**
	 * Obtienir le bon MotionlessElement du fichier symbole.
	 *
	 * @param fileSymbol le symbole du fichier
	 * @return le symbole du fichier de départ
	 */
	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
				return motionlessElement;
			}
		}
		return background;
	}
}