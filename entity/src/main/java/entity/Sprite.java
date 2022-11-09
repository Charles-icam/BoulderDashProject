package entity;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * <h1>The Sprite class.</h1>
 *
 * @author Junior Mabaya
 * @version 0.1
 */

public class Sprite {

	/** L'image. */
    private Image   image;

    /** Le nom de l'image. */
    private String  imageName;

    /** L'image de la console. */
    private char    consoleImage;

    /** L'image chargée. */
    private boolean imageLoaded;
    
    /**
     * Instatiation d'un sprite
     * @param character
     * @param imageName
     */
    public Sprite(final char character, final String imageName) {
        this.setConsoleImage(character);
        this.setImageName(imageName);
    }
    
    /**
     * Instatiation d'un sprite
     * @param character
     */
    public Sprite(final char character) {
        this(character, "noimage.jpg");
    }

    /**
     * Getter de l'image
     * @return
     */
    public final Image getImage() {
        return this.image;
    }

    /**
     * Méthode pour chargé une image
     * @throws IOException
     */
    public final void loadImage() throws IOException {
        this.setImage(ImageIO.read(new File("sprites\\" + this.getImageName())));
    }
    
    /**
     * Obtenir l'image de la console
     * @return consoleImage
     */
    public final char getConsoleImage() {
        return this.consoleImage;
    }
    
    /**
     * Setter de l'image
     * @param image
     */
    private void setImage(final Image image) {
        this.image = image;
    }
    
    /**
     * Setter de consoleImage
     * @param consoleImage
     */
    private void setConsoleImage(final char consoleImage) {
        this.consoleImage = consoleImage;
    }
    
    /**
     * Getter de imageName
     * @return imageName
     */
    public final String getImageName() {
        return this.imageName;
    }
    
    /**Modifie le nom de l'image
     * 
     * @param imageName
     */
   
    private void setImageName(final String imageName) {
        this.imageName = imageName;
    }
    
    /**
     * Méthode qui vérifie si l'image a été chargé
     * @return
     */

    public final boolean isImageLoaded() {
        return this.imageLoaded;
    }

    public final void setImageLoaded(final boolean isImageLoaded) {
        this.imageLoaded = isImageLoaded;
    }
}
