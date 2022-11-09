package entity.mobile;
public class MobileElementsFactory {

	/**
	 * Le monstre vert 
	 */
	private final static MonsterG monsterG = new MonsterG();
	/**
	 * Le monstre rouge 
	 */
	private final static MonsterR monsterR = new MonsterR();
	/**
	 * Le diamand
	 */
	private final static Diamond diamond = new Diamond();
	/**
	 * Le rocher
	 */
	private final static Boulder boulder = new Boulder();

	/**
	 * La liste des éléments
	 */
	private static Mobile[] mobileElements = { monsterR, monsterG, diamond, boulder};

	/**
	 * Obtenir le symbole du fichier
	 * @param fileSymbol
	 * @return
	 */
	public static Mobile getFromFileSymbol(final char fileSymbol) {
		for (final Mobile mobileElement : mobileElements) {
			if (mobileElement.getSprite().getConsoleImage() == fileSymbol) {
				return mobileElement;
			}
		}
		return boulder;
	}

	/**
	 * Créer le monstre rouge 
	 * @return Red Monster
	 */
	public static Mobile createMonsterR() {
		return monsterR;
	}
	
	/**
	 * Créer le monstre vert 
	 * @return Green Monster
	 */
	public static Mobile createMonsterG() {
		return monsterG;
	}

	/**
	 * Créer le diamand
	 * @return diamond
	 */
	public static Mobile createDiamond() {
		return diamond;
	}

	/**
	 * Créer le rocher
	 * @return boulder
	 */
	public static Mobile createRock() {
		return boulder;
	}

}