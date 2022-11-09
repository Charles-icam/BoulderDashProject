package entity.mobile;

import java.awt.Point;

import fr.exia.showboard.IBoard;
import entity.Element;
import entity.IMap;
import entity.Permeability;
import entity.Sprite;

/**
 * <h1>La Classe Mobile </h1>
 * @version 0.3
 */
abstract class Mobile extends Element implements IMobile {

	/**
	 * Les coordonnées
	 */
	private Point position;

	/** L'état de vie du joueur */
	private Boolean alive = true;

	/** La route. */
	private IMap map;

	/** La  planche. */
	private IBoard board;

	/**
	 * Constructeur d'un nouveau mobile en fonction des paramètres.
	 *
	 * @param sprite
	 * @param map
	 * @param permeability
	 */
	Mobile(final Sprite sprite, final IMap map, final Permeability permeability) {
		super(sprite, permeability);
		this.setMap(map);
		this.position = new Point();
	}

	/**
	 * Constructeur d'un nouveau mobile en fonction des paramètres.
	 * 
	 * @param sprite
	 * @param permeability
	 */
	Mobile(final Sprite sprite, final Permeability permeability) {
		super(sprite, permeability);
		this.position = new Point();
	}

	/**
	 * Constructeur d'un nouveau mobile en fonction des paramètres.
	 *
	 * @param x
	 * @param y
	 * @param sprite
	 * @param map
	 * @param permeability
	 */
	Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		this(sprite, map, permeability);
		this.setX(x);
		this.setY(y);
	}

	/*
	 * La méthode Move up
	 * 
	 */
	@Override
	public void moveUp() {
		this.setY(this.getY() - 1);
		this.setHasMoved();
	}

	/*
	 * La méthode Move left
	 * 
	 */
	@Override
	public void moveLeft() {
		this.setX(this.getX() - 1);
		this.setHasMoved();
	}

	/*
	 * La méthode Move down
	 * 
	 */
	@Override
	public void moveDown() {
		this.setY(this.getY() + 1);
		this.setHasMoved();
	}

	/*
	 * La méthode Move right
	 * 
	 */
	@Override
	public void moveRight() {
		this.setX(this.getX() + 1);
		this.setHasMoved();
	}

	/*
	 * La méthode do nothing
	 * 
	 */
	@Override
	public void doNothing() {
		this.setHasMoved();
	}

	/**
	 * Setter de hasmoved.
	 */
	protected void setHasMoved() {
		this.getMap().setMobileHasChanged();
	}

	/*
	 * Getter du coordonées X
	 * 
	 */
	@Override
	public final int getX() {
		return this.getPosition().x;
	}

	/**
	 * Setter du coordonées x.
	 *
	 * @param x le nouveau x
	 */
	public final void setX(final int x) {
		this.getPosition().x = x;

	}

	/*
	 * Getter du coordonées Y
	 * 
	 */
	@Override
	public final int getY() {
		return this.getPosition().y;
	}

	/**
	 * Setter de y.
	 *
	 * @param y
	 */
	public final void setY(final int y) {
		this.getPosition().y = y;

	}

	/**
	 * Getter de la map.
	 *
	 * @return la map
	 */
	public IMap getMap() {
		return this.map;
	}

	/**
	 * Setter de la map.
	 *
	 * @param map la nouvelle map
	 */
	private void setMap(final IMap map) {
		this.map = map;
	}

	/*
	 * Obternir l'état de vie
	 * 
	 */
	@Override
	public Boolean isAlive() {
		return this.alive;
	}

	/**
	 * La mort.
	 */
	public void die() {
		this.alive = false;
		this.setHasMoved();
	}

	/*
	 * Getter de la position
	 * 
	 */
	@Override
	public Point getPosition() {
		return this.position;
	}

	/**
	 * Setter the position.
	 *
	 * @param position la position changée
	 */
	public void setPosition(final Point position) {
		this.position = position;
	}

	/**
	 * Getter du board.
	 *
	 * @return board la planche.
	 */
	protected IBoard getBoard() {
		return this.board;
	}

}