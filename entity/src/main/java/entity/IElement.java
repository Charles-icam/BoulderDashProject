package entity;


import fr.exia.showboard.ISquare;

/**
 *   <h1>The Interface IElement.</h1>
 * @author Eliott Holel
 *
 */
public interface IElement extends ISquare {
	/**
	 * Getter de sprite.
	 *
	 * @return le sprite
	 */
	Sprite getSprite();

	/**
	 * Getter de la permeability.
	 *
	 * @return la permeability
	 */
	Permeability getPermeability();

	Boolean getHasChanged();

	void setHasChanged(Boolean hasChanged);

}