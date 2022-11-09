package entity;

import java.awt.Image;

public abstract class Element implements IElement {


    /**
     * L'attribut sprite.
     */
    private Sprite sprite;

    /**
     * L'attribut permeability de type Permeability.
     */
    private Permeability permeability;

    private Boolean hasChanged = false;

    /**
     * Le constructeur d'un nouveau element
     * @param sprite
     * @param permeability
     */
    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }


    /**
     * Getter de sprite
     */
    public final Sprite getSprite() {
        return this.sprite;
    }

    /**
     * Setter de sprite.
     *
     * @param sprite le nouveau sprite
     */

    protected final void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.exia.insanevehicles.model.element.IElement#getPermeability()
     */
    public final Permeability getPermeability() {
        return this.permeability;
    }

    /**
     * Setter de la permeability.
     *
     * @param permeability la nouvelle permeability
     */
    private void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

    /*
     * Getter de Image
     *
     */
    public final Image getImage() {
        return this.getSprite().getImage();
    }

    /*
     * Getter de hasChanged
     *
     */
    
    public Boolean getHasChanged() {
        return hasChanged;
    }

    /*
     * Setter de hasChanged
     *
     */
    public void setHasChanged(Boolean hasChanged) {
        this.hasChanged = hasChanged;
    }
}