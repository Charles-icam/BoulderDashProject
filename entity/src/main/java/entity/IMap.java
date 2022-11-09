package entity ;

import java.util.List;
import java.util.Observable;

/**
 * <h1>The Interface IMap.</h1>
 *
 * @author Christian Byemba
 * @version 0.1
 */
public interface IMap {

    /**
     * Getter de width (la largeur).
     *
     * @return width
     */
    int getWidth();

    /**
     * Getter de height(la hauteur).
     *
     * @return height
     */
    int getHeight();

    /**
     * Obtenir la map XY.
     *
     * @param x
     *            Coordonnée x
     * @param y
     *            Coordonnée y
     * @return la route
     */
    IElement getOnTheMapXY(int x, int y);
    
    /**
     * Modifie la map XY 
     * @param element
     * @param x
     * @param y
     */
    void setOnTheMapXY(IElement element, final int x, final int y);

    /**
     * Setter du mobile qui a changé.
     */
    void setMobileHasChanged();

    /**
     * Obtenir l'observable.
     *
     * @return observable
     */
    Observable getObservable();

    boolean isCorrect();

    List<Integer> getHasChanged();


}