package entity.mobile;

import entity.Permeability;
import entity.Sprite;

public class Boulder extends Mobile {

	 /** La Constante du SPRITE. */
    private static final Sprite SPRITE = new Sprite('O', "boulder.png");

    /**
     * Définition du constructeur.
     */
    public Boulder() {
        super(SPRITE, Permeability.BOULDER);
    }
    
    @Override
    public void moveRight() {
    	super.moveRight();
    }

    @Override
    public void win() {
        
        return;
    }

    @Override
    public void moveLeft() {
    	super.moveLeft();
    }
    
    @Override 
    public void moveDown() {
    	super.moveDown();
    }

    /**
     *Le Getter des diamands
     */
    @Override
	public int getDiamonds() {
		return 0;
	}

    /**
     *Le Getter des diamands
     */
    @Override
    public void grabDiamond() {
        return;
    }
	
	
}